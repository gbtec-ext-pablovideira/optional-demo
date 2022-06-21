package com.pabvid.optionaldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/test")
public class DemoController {


    @PatchMapping()
    public void patchSomething( @RequestBody WhateverInput taskUpdateInput){

        System.err.println(taskUpdateInput);


    }





}
