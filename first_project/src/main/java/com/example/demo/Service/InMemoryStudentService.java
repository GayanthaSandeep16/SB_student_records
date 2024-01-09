/*
 * Copyright (c) 2023. CodeGen International (Pvt) Ltd. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of CodeGen
 * International (Pvt) Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with CodeGen International.
 *
 */
package com.example.demo.Service;

import com.example.demo.criteria.StudentSearchCriteria;
import com.example.demo.dto.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author gayanthas
 * @since 10 Jul 2023
 */

@Service
public class  InMemoryStudentService implements IStudentService
{
    private final Map<Long,Student> studentMap = new HashMap<>();
    private final AtomicLong studentIdSequence = new AtomicLong();


    @Override
    public Student save( Student student )
    {
        Long id = studentIdSequence.incrementAndGet();
        student.setId( id );
        studentMap.put( id, student );
        return studentMap.get( id );
    }

    @Override
    public Student getById( Long id )
    {
        return studentMap.get( id );
    }

    @Override
    public Student update( Long pd, Student student )
    {
        studentMap.put( pd,student );
        return studentMap.get( pd );
    }

    @Override
    public void deleteById( Long id )
    {
        studentMap.remove( id );
    }

    @Override
    public List<Student> search( StudentSearchCriteria criteria )

    {
        String name = criteria.getName();
        return studentMap.values().stream().filter( student -> name == null || student.getName().startsWith( name ) ).collect( Collectors.toList() );

    }
}
