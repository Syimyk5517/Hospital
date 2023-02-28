package com.example.springboothospita.services;

import com.example.springboothospita.models.Hospital;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface HospitalService {
    List<Hospital> getAll();
    void save(Hospital hospital);
    Hospital findById(Long id);
    void deleteById(Long id);
    void updateHospital(Long id,Hospital newHospital);
}
