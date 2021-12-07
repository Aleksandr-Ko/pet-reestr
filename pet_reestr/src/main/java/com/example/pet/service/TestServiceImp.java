package com.example.pet.service;

import com.example.pet.repository.TestRepository;
import com.example.pet.table.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImp implements TestService{
    @Autowired
    TestRepository testRepository;

    @Override
    public void create(Test test) {
        testRepository.save(test);
    }

    @Override
    public Test readAll() {
        Iterable<Test> result = testRepository.findAll();
        return result.iterator().next();
    }

    @Override
    public Test readOne(Integer id) {
        Optional<Test> result = testRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new ResourceNotFoundException("не найден");
        }
    }

    @Override
    public boolean update(Test test, Integer id) {
        if (testRepository.existsById(id)) {
            testRepository.save(test);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        testRepository.deleteById(id);
        return false;
    }
}
