package com.example.pet.repository;

import com.example.pet.table.Referral;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ReferralRepository extends CrudRepository<Referral, Integer> {

    @Override
    Optional<Referral> findById(Integer integer);

    @Override
    void deleteById(Integer integer);
}
