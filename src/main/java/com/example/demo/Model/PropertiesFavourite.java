package com.example.demo.Model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesFavourite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String userId;
	String postId;
}
