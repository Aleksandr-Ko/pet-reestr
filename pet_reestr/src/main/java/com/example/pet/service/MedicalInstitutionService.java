package com.example.pet.service;


import com.example.pet.table.MedicalInstitution;
import com.example.pet.table.Patient;

import java.util.Optional;

public interface MedicalInstitutionService {
    /**
     * Создает нового medicalInstitution
     * @param medicalInstitution - medicalInstitution для создания
     */
    void create(MedicalInstitution medicalInstitution);

    /**
     * Возвращает список всех имеющихся medicalInstitution
     * @return список medicalInstitution
     */
    Iterable<MedicalInstitution> readAll();

    /**
     * Возвращает medicalInstitution по его ID
     * @param id - ID medicalInstitution
     * @return - объект medicalInstitution с заданным ID
     */
    Optional<MedicalInstitution> readOne(Integer id);

    /**
     * Обновляет medicalInstitution с заданным ID,
     * в соответствии с переданным medicalInstitution
     * @param //medicalInstitution - medicalInstitution в соответсвии с которым нужно обновить данные
     * @param id - id medicalInstitution, которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(MedicalInstitution medicalInstitution, Integer id);

    /**
     * Удаляет medicalInstitution с заданным ID
     * @param id - id medicalInstitution, которого нужно удалить
     * @return - true если medicalInstitution был удален, иначе false
     */
    boolean deleteById(Integer id);
}

