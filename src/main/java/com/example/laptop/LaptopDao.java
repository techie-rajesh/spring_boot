package com.example.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class LaptopDao 
{	
	@Autowired
	LaptopRepository lr;
	public String store(List<Laptop> l) {
		// TODO Auto-generated method stub
		lr.saveAll(l);
		return "Stroed";
	}
	public List<Laptop> retrive() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}
	public Laptop getObj(int id) {
		// TODO Auto-generated method stub
		return lr.findById(id).get();
	}
	public String detele(int id) {
		// TODO Auto-generated method stub
		lr.deleteById(id);
		return "Delete";
	}
	

}
