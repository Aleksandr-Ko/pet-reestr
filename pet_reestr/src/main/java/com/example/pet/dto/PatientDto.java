package com.example.pet.dto;

import lombok.Data;


@Data
public class PatientDto {

    private String surname;
    private String name;
    private String snils;

    public PatientDto() {
    }
}
