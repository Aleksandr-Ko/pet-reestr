package com.example.pet.service;

import com.example.pet.repository.MedicalInstitutionRepository;
import com.example.pet.table.MedicalInstitution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalInstitutionServiceImp implements MedicalInstitutionService{

    @Autowired
    MedicalInstitutionRepository medicalInstitutionRepository;

    @Override
    public void create(MedicalInstitution medicalInstitution) {
        medicalInstitutionRepository.save(medicalInstitution);
    }

    @Override
    public Iterable<MedicalInstitution> readAll() {
       return medicalInstitutionRepository.findAll();
    }

    @Override
    public Optional<MedicalInstitution> readOne(Integer id) {
        return medicalInstitutionRepository.findById(id);
    }

    @Override
    public boolean update(MedicalInstitution medicalInstitution, Integer id) {
        if (medicalInstitutionRepository.existsById(id)) {
            medicalInstitutionRepository.save(medicalInstitution);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        medicalInstitutionRepository.deleteById(id);
        return false;
    }
}
