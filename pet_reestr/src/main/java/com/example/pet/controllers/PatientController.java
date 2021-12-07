package com.example.pet.controllers;


import com.example.pet.dto.PatientDto;
import com.example.pet.service.PatientService;
import com.example.pet.table.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.Optional;


@RestController
public class PatientController {

    @Autowired
    PatientService patientService;
    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/patient-dto/{id}")
    public ResponseEntity<PatientDto> getPostById(@PathVariable(name = "id") Integer id) {
        Patient patient =  patientService.readOne(id);

        // convert entity to DTO
        PatientDto patientResponse = modelMapper.map(patient, PatientDto.class);

        return ResponseEntity.ok().body(patientResponse);
    }


    @GetMapping("/patient")
    public Iterable<Patient> readAll() {
        return patientService.readAll();
    }

    @GetMapping("/patient/{id}")
    public Patient readOne(@Validated @PathVariable("id") Integer id) {
            return patientService.readOne(id);
    }

    @PostMapping("/patient")
    public ResponseEntity<Patient> create(@Validated @RequestBody Patient patient) {
        patientService.create(patient);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/patient/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody Patient patient) {
//    // convert DTO to Entity
//        Patient patientRequest = modelMapper.map(patientDto, Patient.class);
//        Patient patient = patientService.update
//                (patientRequest, id);
//
//        // entity to DTO
//    PatientDto patientResponse = modelMapper.map(patient, PatientDto.class);
//    return ResponseEntity.ok().body(patientResponse);

        final boolean updated = patientService.update(patient, id);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping("/patient/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer id) {
        final boolean deleted = patientService.deleteById(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.NOT_MODIFIED)
                : new ResponseEntity<>(HttpStatus.OK);
    }
}






