package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Tinhthanhpho;

public interface CityRepository extends JpaRepository<Tinhthanhpho, String> {

}
