package com.example.springboothospita.services;

import com.example.springboothospita.models.Department;
import com.example.springboothospita.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DoctorService {
    List<Doctor> getAll(Long id);
    void save(Long hospitalId,Doctor doctor);

    Doctor findById(Long id);
    Doctor update(Long doctorId,Doctor doctor);
    void assignDoctor(Long doctorId, Doctor doctor);
    void delete(Long id);
//    List<Department> getAllDepartmentDoctorById(Long doctorId);

}
