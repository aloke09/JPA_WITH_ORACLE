package com.bridgelabz.simpleJPA.service;

import com.bridgelabz.simpleJPA.model.Emp;
import com.bridgelabz.simpleJPA.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService
{
    @Autowired
    EmpRepo repo;

    public Emp insertEmp(Emp emp)
    {
        return repo.save(emp);
    }

    public List<Emp> insertMultipleEmp(List<Emp> e)
    {
        return repo.saveAll(e);
    }

    public List<Emp> getAllEmp()
    {
        return repo.findAll();
    }

    public Emp getById(int id)
    {
        return repo.findById(id).orElse(null);
    }

//    public Emp getByFirstName(String name)
//    {
//        return repo.findByFirstName(name);
//    }

    public String delById(int id)
    {
        repo.deleteById(id);
        return "Employee removed "+id;
    }

    public Emp updateEmp(Emp emp)
    {
        Emp contains = repo.findById(emp.getId()).orElse(null);
        contains.setfName(emp.getfName());
        contains.setlName(emp.getlName());
        contains.seteMail(emp.geteMail());
        return repo.save(contains);
    }
}
