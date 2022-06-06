package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.PropertiesFavourite;

public interface FavouriteRepository extends JpaRepository<PropertiesFavourite, Integer> {
	List<PropertiesFavourite> findById(int id);
}
