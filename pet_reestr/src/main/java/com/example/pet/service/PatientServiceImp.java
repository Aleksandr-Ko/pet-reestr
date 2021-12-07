package com.example.pet.service;

import com.example.pet.repository.PatientRepository;
import com.example.pet.table.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImp implements PatientService {
    @Autowired
    PatientRepository patientRepository;


    @Override
    public void create(Patient patient) {
        patientRepository.save(patient);
    }


    @Override
    public Iterable<Patient> readAll() {
        return patientRepository.findAll();
    }


    @Override
    public Patient readOne(Integer id) {
        Optional<Patient> result = patientRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new ResourceNotFoundException("не найден");
        }

    }


    @Override
    public boolean update(Patient patient, Integer id) {
//        Patient patient = patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient", "id", id));
//
//        patient.setSurname(patientRequest.getSurname());
//        patient.setName(patientRequest.getName());

//        return patientRepository.save(patient);
        if (patientRepository.existsById(id)) {
            patientRepository.save(patient);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        patientRepository.deleteById(id);
        return false;
    }
}
