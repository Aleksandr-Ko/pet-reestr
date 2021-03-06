package com.example.pet.table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Null;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @Column(name = "test_id")
    @SequenceGenerator(name = "testIdSeq", sequenceName = "test_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "testIdSeq")
    private Integer testId;


    @Null
    @Column(name = "result")
    private Integer result;


    @OneToOne
    @JoinColumn(name = "service_id", unique = true, nullable = false)
    private Service service;

    @ManyToOne
    @JoinColumn(name = "referral_id")
    private Referral referralId;


    public Test(){}

    public Test(Integer result,Service service, Referral referralId) {
        this.result = result;
        this.service = service;
        this.referralId = referralId;
    }


    public Integer getTestId() {
        return testId;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Referral getReferralId() {
        return referralId;
    }

    public void setReferralId(Referral referralId) {
        this.referralId = referralId;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
