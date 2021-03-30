package co.com.sofka.CrudPerson.repository;

import co.com.sofka.CrudPerson.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IrepositoryRepo  {

    Flux<Person> allPersons();
    Mono<Person> findPerson(Long personaId);
    Mono<Person> savePerson(Person person);
    Mono<Void> deletePerson(Long personaId);
    Mono<Person> updatePerson(Person person);

}
