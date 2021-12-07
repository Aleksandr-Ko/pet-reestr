package com.example.pet.repository;

import com.example.pet.dto.PatientDto;
import com.example.pet.table.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface PatientRepository extends CrudRepository<Patient, Integer> {

    @Override
    Optional<Patient> findById(Integer integer);


    @Override
    void deleteById(Integer integer);


}
