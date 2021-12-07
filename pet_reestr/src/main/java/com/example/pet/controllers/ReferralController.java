package com.example.pet.controllers;

import com.example.pet.repository.ReferralRepository;
import com.example.pet.service.ReferralService;
import com.example.pet.service.ReferralServiceImpl;
import com.example.pet.table.Referral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ReferralController {
    @Autowired
    ReferralRepository referralRepository;

    @Autowired
    ReferralService referralService;

    @GetMapping("/referral")
    public Iterable<Referral> readAll() {

        return referralRepository.findAll();
    }

    @GetMapping("/referral/{id}")
    public Optional<Referral> readOne(@PathVariable("id") Integer id) {
        return referralRepository.findById(id);
    }

    @PostMapping("/referral")
    public ResponseEntity<Referral> create(@RequestBody Referral referral ) {
        referralRepository.save(referral);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
