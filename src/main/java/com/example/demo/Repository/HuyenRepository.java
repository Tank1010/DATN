package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Quanhuyen;

public interface HuyenRepository extends JpaRepository<Quanhuyen, String>{
	List<Quanhuyen> findByMatp(String matp);
}
