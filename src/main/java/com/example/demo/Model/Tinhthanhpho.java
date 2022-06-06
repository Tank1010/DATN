package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tinhthanhpho")
public class Tinhthanhpho {
	@Id
	@Column(name="matp")
	String matp;
	@Column(name="name")
	String name;
	@Column(name="type")
	String type;
}
