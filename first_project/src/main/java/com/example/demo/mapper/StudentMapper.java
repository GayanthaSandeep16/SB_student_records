/*
 * Copyright (c) 2023. CodeGen International (Pvt) Ltd. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of CodeGen
 * International (Pvt) Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with CodeGen International.
 *
 */
package com.example.demo.mapper;

import com.example.demo.dao.StudentDAO;
import com.example.demo.dto.Student;
import org.springframework.stereotype.Component;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author gayanthas
 * @since 10 Jul 2023
 */
@Component
public class StudentMapper
{
    public StudentDAO mapIn( Student student ){
        StudentDAO dao = new StudentDAO();
        dao.setId( student.getId() );
        dao.setName( student.getName() );
        dao.setEmail( student.getEmail() );
        return dao;

    }
    public Student mapOut(StudentDAO dao){
        Student dto = new Student();
        dao.setId( dao.getId() );
        dao.setName( dao.getName() );
        dao.setEmail( dao.getEmail() );
        return dto;


    }
}
