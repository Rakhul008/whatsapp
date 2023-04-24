package com.whatsapp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.whatsapp.demo.entity.Rakhul;
import com.whatsapp.demo.repository.RakhulRepository;

@Service
public class RakhulService {
	@Autowired
	RakhulRepository repobj;
	
public Rakhul saveInfo(@RequestBody Rakhul obj)
{
	return repobj.save(obj);
}
public List<Rakhul> getAllRakhul()
{
	List<Rakhul> listobj=repobj.findAll();
	return listobj; 
			}
public void  deleteInfo(int id)
{
	repobj.deleteById(id);
}
public Rakhul updateInfo(Rakhul iu)
{
	return repobj.saveAndFlush(iu);
}
}
