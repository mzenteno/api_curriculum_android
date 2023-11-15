package com.zenteno.login1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.zenteno.login1.Entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    
    @Query("SELECT * FROM person p WHERE p.name like lower(?1)")
    List<Person> getByNameWithQuery(String name); 

}