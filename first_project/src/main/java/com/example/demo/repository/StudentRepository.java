/*
 * Copyright (c) 2023. CodeGen International (Pvt) Ltd. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of CodeGen
 * International (Pvt) Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with CodeGen International.
 *
 */
package com.example.demo.repository;

import com.example.demo.criteria.StudentSearchCriteria;
import com.example.demo.dao.StudentDAO;
import com.example.demo.dto.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author gayanthas
 * @since 10 Jul 2023
 */

@Repository
public class StudentRepository
{
    public StudentDAO save( StudentDAO studentDAO ){
        return null;

    };

    public StudentDAO getById( Long id ){
        return null;

    };

    public StudentDAO update( Long pd, Student student ){
        return null;

    };

    public void deleteById( Long id ){

    };

    public List<StudentDAO> search( StudentSearchCriteria criteria ){
        return null;

    };


}
