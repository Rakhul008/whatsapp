package com.whatsapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.demo.entity.Rakhul;
import com.whatsapp.demo.service.RakhulService;

@RestController
public class RakhulController {
@Autowired
RakhulService serobj;

@PostMapping("/post")
public  Rakhul addDetails(@RequestBody Rakhul obj1)
{
	return serobj.saveInfo(obj1);
}
@GetMapping("/get")
public List<Rakhul> getAllRakhul()
{
	List<Rakhul> listobj= serobj.getAllRakhul();
	return listobj;
}
@PutMapping("/put")
	public Rakhul updateDetails(@RequestBody Rakhul id)
	{
		return serobj.updateInfo(id);
	}
@DeleteMapping("/delhm/{cid}")
public String deleteDetails(@PathVariable ("cid") int id)
{
	serobj.deleteInfo(id);
	return "Rakhul"+id+" is deleted";
}
@DeleteMapping("/deleteByreq")
public String deleteByRequestPara(@RequestParam ("cid") int id)
{
	serobj.deleteInfo(id);
	return "Rakhul "+id+" is deleted";
}
}




