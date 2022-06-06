package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="quanhuyen")
public class Quanhuyen {
	@Id
	@Column(name="maqh")
	String maqh;
	@Column(name="name")
	String name;
	@Column(name="type")
	String type;
	@Column(name="matp")
	String matp;
	
}
