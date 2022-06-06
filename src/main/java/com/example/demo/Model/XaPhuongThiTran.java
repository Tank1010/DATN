package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xaphuongthitran")
public class XaPhuongThiTran {
	@Id
	@Column(name="xaid")
	String xaid;
	@Column(name="name")
	String name;
	@Column(name="type")
	String type;
	@Column(name="maqh")
	String maqh;
}
