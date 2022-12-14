package com.example.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LaptopService 
{
	@Autowired
	LaptopDao ld;
	public String store(List<Laptop> l) {
		// TODO Auto-generated method stub
		return ld.store(l);
	}
	public List<Laptop> retrive() {
		// TODO Auto-generated method stub
		return ld.retrive();
	}
	public Laptop getObj(int id) {
		// TODO Auto-generated method stub
		return ld.getObj(id);
	}
	public String delete(int id) {
		// TODO Auto-generated method stub
		return ld.detele(id);
	}

}
