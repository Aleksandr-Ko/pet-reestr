package com.example.pet.service;

import com.example.pet.table.Referral;

import java.util.Optional;

public interface ReferralService {

    /**
     * Создает нового пациента
     * @param referral - пациент для создания
     */
    void create(Referral referral);

    /**
     * Возвращает список всех имеющихся referral
     * @return список referral
     */
    Iterable<Referral> readAll();

    /**
     * Возвращает referral по его ID
     * @param id - ID referral
     * @return - объект referral с заданным ID
     */
    Optional<Referral> readOne(Integer id);

    /**
     * Обновляет referral с заданным ID,
     * в соответствии с переданным referral
     * @param - referral в соответсвии с которым нужно обновить данные
     * @param id - id referral, которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Referral referral, Integer id);

    /**
     * Удаляет referral с заданным ID
     * @param id - id referral, которого нужно удалить
     * @return //referral- true если referral был удален, иначе false
     */
    boolean deleteById(Integer id);
}
