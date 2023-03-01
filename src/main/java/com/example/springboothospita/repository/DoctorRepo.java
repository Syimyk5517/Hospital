package com.example.springboothospita.repository;


import com.example.springboothospita.models.Department;
import com.example.springboothospita.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Long> {
    @Query("select d from Doctor  d where  d.hospital.id=:id")
    List<Doctor> getAllHospitalById(Long id);

}
