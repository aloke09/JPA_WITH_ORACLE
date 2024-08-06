package com.bridgelabz.simpleJPA.repo;

import com.bridgelabz.simpleJPA.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Integer>
{

}
