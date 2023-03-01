package com.example.springboothospita.services;

import com.example.springboothospita.models.Department;
import com.example.springboothospita.models.Doctor;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll(Long id);
    void save(Long id ,Department department) ;
    Department finById(Long id);
    void deleteById(Long id);
    void update(Long departmentId,Department department);
    List<Department> getAllDepartmentByDoctorId(Long id);
}
