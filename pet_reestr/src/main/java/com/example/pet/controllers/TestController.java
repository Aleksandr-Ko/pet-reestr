package com.example.pet.controllers;

import com.example.pet.repository.TestRepository;
import com.example.pet.service.TestService;
import com.example.pet.table.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/test")
    public Test readAll() {
        return testService.readAll();
    }
@GetMapping("/test/{id}")
    public Test readOne (@Validated @PathVariable("id") Integer id){
        return testService.readOne(id);
}



}


