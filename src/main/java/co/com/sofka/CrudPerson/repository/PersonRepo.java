package co.com.sofka.CrudPerson.repository;

import co.com.sofka.CrudPerson.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepo implements IrepositoryRepo {

    private static final Logger Log = LoggerFactory.getLogger(PersonRepo.class);

    @Override
    public Flux<Person> allPersons() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1L, "1011390275", "Brayan"));
        people.add(new Person(2L, "1011390435", "Oscar"));
        return Flux.fromIterable(people);
    }

    @Override
    public Mono<Person> findPerson(Long personaId) {
        return Mono.just(new Person(personaId, "1011390275", "Brayan"));
    }

    @Override
    public Mono<Person> savePerson(Person person) {
        Log.info(person.toString());
        return Mono.just(person);
    }

    @Override
    public Mono<Void> deletePerson(Long personaId) {
        return Mono.empty();
    }

    @Override
    public Mono<Person> updatePerson(Person person) {
        Log.info(person.toString());
        return Mono.just(person);
    }
}
