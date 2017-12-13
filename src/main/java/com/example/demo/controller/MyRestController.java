package com.example.demo.controller;

import com.example.demo.bean.Person;
import com.example.demo.service.MyService;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "保存用户信息接口",notes = "保存用户信息接口")
    @RequestMapping(value = "/savePerson",method = RequestMethod.POST)
public String savePerson(@RequestBody Person person){
        personService.savePerson(person);
        return "success";
}

}
