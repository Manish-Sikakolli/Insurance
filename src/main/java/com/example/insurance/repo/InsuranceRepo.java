package com.example.insurance.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.insurance.java.Insurance;

public interface InsuranceRepo extends JpaRepository<Insurance ,Integer>  {

}

