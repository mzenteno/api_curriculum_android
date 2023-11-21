package com.zenteno.login1.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.zenteno.login1.Entity.Job;
import com.zenteno.login1.Entity.Person;
import com.zenteno.login1.Service.JobService;
import com.zenteno.login1.Service.PersonService;


@RestController
@CrossOrigin
@RequestMapping(path = "/api")
public class PersonController {
    @Autowired
    PersonService personService;

    @Autowired
    JobService jobService;

    @PostMapping(path = "/person")
    public Person createPerson(@RequestBody Person _person) {
        try {
            Job oJob = jobService.getJobxId(_person.getJob().getId());
            if (oJob == null) {
                oJob = new Job(0, _person.getJob().getDescription());
                jobService.createJob(oJob);
            }

            _person.setJob(oJob);
            return personService.createPerson(_person);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }

    @GetMapping("/person")
    public List<Person> findAll() {
        try{
            return personService.getAllPerson();
        } catch(Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found", e);
        }
    }

}
