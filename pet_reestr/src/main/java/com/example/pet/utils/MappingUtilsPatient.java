package com.example.pet.utils;

import com.example.pet.dto.PatientDto;
import com.example.pet.table.Patient;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@SpringBootApplication
public class MappingUtilsPatient {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(MappingUtilsPatient.class, args);
    }
//    // из entity в dto
//
//    public PatientDto mapToProductDto(Patient patient){
//
//        PatientDto dto = new PatientDto();
//        dto.setPatientId(patient.getPatientId());
//        dto.setSurname(patient.getSurname());
//        dto.setName(patient.getName());
//
//        return dto;
//    }
//    //из dto в entity
//    public Patient mapToProductEntity(PatientDto dto){
//
//        Patient patient = new Patient();
//
//        patient.setSurname(dto.getSurname());
//        patient.setName(dto.getName());
//
//
//        return patient;
//    }
}
