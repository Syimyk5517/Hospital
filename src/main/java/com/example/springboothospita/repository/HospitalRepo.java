package com.example.springboothospita.repository;
import com.example.springboothospita.models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital,Long> {

}
