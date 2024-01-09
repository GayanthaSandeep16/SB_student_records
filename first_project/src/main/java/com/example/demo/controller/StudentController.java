/*
 * Copyright (c) 2023. CodeGen International (Pvt) Ltd. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of CodeGen
 * International (Pvt) Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with CodeGen International.
 *
 */
package com.example.demo.controller;

import com.example.demo.Service.IStudentService;
import com.example.demo.criteria.StudentSearchCriteria;
import com.example.demo.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author gayanthas
 * @since 10 Jul 2023
 */

@RestController
@RequestMapping( "students" )
public class StudentController
{
    @Autowired
    private IStudentService studentService;

    @PostMapping
    public Student save( @RequestBody Student student )
    {
        return studentService.save(student);
    }

    @GetMapping( "{id}" )
    public Student getById( @PathVariable( "id" ) Long id )
    {
        return studentService.getById(id);

    }

    @PutMapping( "{id}" )
    public Student update( @PathVariable( "id" ) Long id, @RequestBody Student student )
    {
        return studentService.update(id,student);

    }

    @DeleteMapping( "{id}" )
    public void deleteById( @PathVariable( "id" ) Long id )
    {
        studentService.deleteById(id);
    }


    @GetMapping
    public List<Student> search( @RequestParam(required = false) String name )
    {

        StudentSearchCriteria criteria = new StudentSearchCriteria();
        criteria.setName( name );
        return studentService.search(criteria);


    }
}
