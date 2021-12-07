package com.example.pet.repository;

import com.example.pet.table.MedicalInstitution;
import com.example.pet.table.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.function.Predicate;

public interface MedicalInstitutionRepository extends CrudRepository<MedicalInstitution, Integer> {
    @Override
    Optional<MedicalInstitution> findById(Integer integer);

    @Override
    void deleteById(Integer integer);
}
