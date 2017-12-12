package com.example.demo.service;

import com.example.demo.bean.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by guiqi on 2017/11/9.
 */
@Service
@Transactional
public class MyService {


    @Autowired
    private PersonRepository personRepository;



    public void createDemoUsers() {
        if (personRepository.findAll().size() == 0) {
            personRepository.save(new Person("sam", "hu", "G", new Date()));
            personRepository.save(new Person("sam2", "hu", "G", new Date()));
        }
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }
}
