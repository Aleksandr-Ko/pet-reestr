package com.example.pet.service;

import com.example.pet.repository.ReferralRepository;
import com.example.pet.table.Referral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReferralServiceImpl implements ReferralService{

    @Autowired
    ReferralRepository referralRepository;

    @Override
    public void create(Referral referral) {
        referralRepository.save(referral);
    }

    @Override
    public Iterable<Referral> readAll() {
        return referralRepository.findAll();
    }

    @Override
    public Optional<Referral> readOne(Integer id) {
        return referralRepository.findById(id);
    }

    @Override
    public boolean update(Referral referral, Integer id) {
        if (referralRepository.existsById(id)) {
            referralRepository.save(referral);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        referralRepository.deleteById(id);
        return false;
    }
}
