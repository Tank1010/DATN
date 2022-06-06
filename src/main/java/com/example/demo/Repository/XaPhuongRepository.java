package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.XaPhuongThiTran;

public interface XaPhuongRepository extends JpaRepository<XaPhuongThiTran, String> {
	List<XaPhuongThiTran> findByMaqh(String maqh);
}
