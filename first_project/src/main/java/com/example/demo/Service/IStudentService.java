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

import java.util.List;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author gayanthas
 * @since 10 Jul 2023
 */
public interface IStudentService
{
    Student save( Student student );

    Student getById( Long id );

    Student update( Long pd, Student student );

    void deleteById( Long id );

    List<Student> search( StudentSearchCriteria criteria );
}
