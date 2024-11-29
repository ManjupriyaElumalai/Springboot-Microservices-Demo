package com.springboot.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long>{

//	Emp save(Optional<Emp> existingEmployee);

}
