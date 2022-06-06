package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CityRepository;
import com.example.demo.Repository.HuyenRepository;
import com.example.demo.Repository.XaPhuongRepository;
import com.example.demo.Model.Quanhuyen;
import com.example.demo.Model.Tinhthanhpho;
import com.example.demo.Model.XaPhuongThiTran;;
@Service
public class SelectionService {
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private HuyenRepository huyenRepository;
	
	@Autowired
	private XaPhuongRepository phuongRepository;
	
	public List<Tinhthanhpho> getAllCities() {
		List<Tinhthanhpho> listCity = cityRepository.findAll();
		return listCity;
	}
	public List<Quanhuyen> getAllProvines(String cityId){
		List<Quanhuyen> listQh = huyenRepository.findByMatp(cityId);
		return listQh;
	}
	public List<XaPhuongThiTran> getAllWards(String provineId){
		List<XaPhuongThiTran> listwr = phuongRepository.findByMaqh(provineId);
		return listwr;
	}
}
