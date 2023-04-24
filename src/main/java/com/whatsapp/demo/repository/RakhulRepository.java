package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsapp.demo.entity.Rakhul;

@Repository
public interface RakhulRepository extends JpaRepository<Rakhul, Integer>{

}
