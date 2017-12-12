package com.example.demo.controller;

import com.example.demo.bean.Person;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guiqi on 2017/11/9.
 */

@RestController
@RequestMapping(value = "/rest")
public class MyRestController {

    @Autowired
    MyService personService;

    @RequestMapping(value = "/savePerson",method = RequestMethod.POST)
public String savePerson(@RequestBody Person person){
        personService.savePerson(person);
        return "success";
}

}
