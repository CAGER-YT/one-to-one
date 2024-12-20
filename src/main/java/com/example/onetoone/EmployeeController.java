package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository er;

    @PostMapping("/post")
    public String createData(@RequestBody List<Employee> e){
        er.saveAll(e);
        return "Data Saved";
    }
    @GetMapping("{id}")
    public List<Employee> getData(@PathVariable int id){
//        Employee e=er.findById(id).get();

        return er.findAll();
    }
    
}
