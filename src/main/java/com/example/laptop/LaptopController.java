package com.example.laptop;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController 
{
	@Autowired
	LaptopService ls;
	@PostMapping(value="/store")
	public String store(@RequestBody List<Laptop> l)
	{
		return ls.store(l);
	}
	
	@GetMapping(value="/retrive")
	public List<Laptop> retrive()
	{
		return ls.retrive();
	}
	@GetMapping(value="/getObj/{id}")
	public Laptop getObj(@PathVariable int id)
	{
		return ls.getObj(id);
	}
	@DeleteMapping(value="/detele/{id}")
	public String delete(@PathVariable int id)
	{
		return ls.delete(id);
	}
}
