package com.example.pet.repository;


import com.example.pet.table.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TestRepository extends CrudRepository<Test, Integer> {

    @Override
    Optional<Test> findById(Integer integer);

    @Override
    void deleteById(Integer integer);
}
