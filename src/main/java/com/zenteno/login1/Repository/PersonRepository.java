package com.zenteno.login1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zenteno.login1.Entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}