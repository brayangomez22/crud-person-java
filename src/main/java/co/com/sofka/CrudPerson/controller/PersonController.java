package co.com.sofka.CrudPerson.controller;

import co.com.sofka.CrudPerson.model.Person;
import co.com.sofka.CrudPerson.repository.PersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private static final Logger Log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonRepo personRepo;

    @GetMapping
    public Flux<Person> allPersons() {
        return personRepo.allPersons();
    }

    @GetMapping("/{id}")
    public Mono<Person> findPerson(@PathVariable("id") Long personaId) {
        return personRepo.findPerson(personaId);
    }

    @PostMapping
    public Mono<Person> savePerson(@RequestBody Person person) {
        return personRepo.savePerson(person);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deletePerson(@PathVariable("id") Long personaId) {
        return personRepo.deletePerson(personaId);
    }

    @PutMapping
    public Mono<Person> updatePerson(@RequestBody Person person) {
        return personRepo.updatePerson(person);
    }
}
