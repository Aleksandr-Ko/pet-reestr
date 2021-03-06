package com.example.pet.service;

import com.example.pet.table.Test;

import java.util.Optional;

public interface TestService {
    /**
     * Создает нового test
     * @param test - test для создания
     */
    void create(Test test);

    /**
     * Возвращает список всех имеющихся test
     * @return список test
     */
    Test readAll();

    /**
     * Возвращает test по его ID
     * @param id - ID test
     * @return - объект test с заданным ID
     */
    Test readOne(Integer id);

    /**
     * Обновляет test с заданным ID,
     * в соответствии с переданным test
     * @param //test - test в соответсвии с которым нужно обновить данные
     * @param id - id test, которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Test test, Integer id);

    /**
     * Удаляет test с заданным ID
     * @param id - id пациента, которого нужно удалить
     * @return //test- true если test был удален, иначе false
     */
    boolean deleteById(Integer id);
}

