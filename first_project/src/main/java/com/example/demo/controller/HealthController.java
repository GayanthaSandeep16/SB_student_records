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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author gayanthas
 * @since 10 Jul 2023
 */
@RestController
@RequestMapping("health")
public class HealthController
{
    @GetMapping
    public String checkHealth(){
        return "Academy Service is running..";
    }
}
