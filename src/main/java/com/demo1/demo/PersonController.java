/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.demo;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class PersonController {
    
    HashMap<String, Person> Map = new HashMap<String, Person>();
    int id = 0;
    
    @Autowired
    Person Person;
    
    @PostMapping(value = "/Person")
    public Person PutPerson(@RequestBody Person p){
        
        id = id+1;
        String i = String.valueOf(id);
        Map.put(i, p);
        return Map.get(i);
        
    }
    
    
    @GetMapping(value = "/Person/{id}")
    @ResponseBody
    public Person GetPerson(@PathVariable("id") String id){
        
        return Map.get(id);
        
        
    }
    
}
