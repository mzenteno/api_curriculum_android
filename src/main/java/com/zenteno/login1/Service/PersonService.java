package com.zenteno.login1.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zenteno.login1.Entity.Person;
import com.zenteno.login1.Repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    //CREATE
    public Person createPerson(Person _person) {
        return personRepository.save(_person);
    }

    //UPDATE
    public Person updatePerson(Integer _id, Person _person) {
        Person oPerson = personRepository.getReferenceById(_id);
        oPerson.setFull_name( _person.getFull_name());
        oPerson.setUbication(_person.getUbication());
        oPerson.setDescription(_person.getDescription());
        oPerson.setPhoto(_person.getPhoto());
        oPerson.setJob(_person.getJob());

        return personRepository.save(oPerson);
    }

    //DELETE
    public void deletePerson(Integer _id) {
        personRepository.deleteById(_id);
    }

    //GET ALL
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    //GET BY ID 
    public Person getPersonxId(Integer _id) {
        return personRepository.getReferenceById(_id);
    }

}