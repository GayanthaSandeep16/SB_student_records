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
import com.example.demo.dao.StudentDAO;
import com.example.demo.dto.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author gayanthas
 * @since 10 Jul 2023
 */
@Service
@Primary
public class DatabaseStudentService implements IStudentService
{
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student save( Student student )
    {
        StudentDAO dao = studentMapper.mapIn( student );
        StudentDAO savedDao = studentRepository.save( dao );
        return studentMapper.mapOut( savedDao );
    }

    @Override
    public Student getById( Long id )
    {
        return null;
    }

    @Override
    public Student update( Long pd, Student student )
    {
        return null;
    }

    @Override
    public void deleteById( Long id )
    {

    }

    @Override
    public List<Student> search( StudentSearchCriteria criteria )
    {
        return null;
    }
}
