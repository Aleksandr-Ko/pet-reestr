package com.example.pet.controllers;

import com.example.pet.repository.MedicalInstitutionRepository;
import com.example.pet.service.MedicalInstitutionService;
import com.example.pet.table.MedicalInstitution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalInstitutionController {
    @Autowired
    MedicalInstitutionRepository medicalInstitutionRepository;

    @Autowired
    MedicalInstitutionService medicalInstitutionService;

    @GetMapping("/medical-institution")
    public Iterable<MedicalInstitution> readAll() {
        return medicalInstitutionService.readAll();
    }
}
