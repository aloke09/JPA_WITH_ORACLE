package com.bridgelabz.simpleJPA.controller;

import com.bridgelabz.simpleJPA.model.Emp;
import com.bridgelabz.simpleJPA.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController
{
    @Autowired
    EmpService service;

    @PostMapping("/addEmployee")
    public Emp addEmployee(@RequestBody Emp e)
    {
        return service.insertEmp(e);
    }

    @PostMapping("/addEmployees")
    public List<Emp> addMultipleEmp(@RequestBody List<Emp> e)
    {
        return service.insertMultipleEmp(e);
    }

    @GetMapping("/Employees")
    public List<Emp> getAllEmp()
    {
        return service.getAllEmp();
    }

    @GetMapping("/getEmployee/{id}")
    public Emp getByEmpId(@PathVariable int id)
    {
        return  service.getById(id);
    }

//    @GetMapping("/getEmployees/{fName}")
//    public Emp getByEmpFirstName(@PathVariable String fName)
//    {
//        return  service.getByFirstName(fName);
//    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteByEmpId(@PathVariable int id)
    {
        return service.delById(id);
    }

    @PutMapping("/updateEmployee")
    public Emp updateEmp(@RequestBody Emp e)
    {
        return service.updateEmp(e);
    }

}
