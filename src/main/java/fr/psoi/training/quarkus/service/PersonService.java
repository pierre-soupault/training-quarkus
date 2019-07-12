package fr.psoi.training.quarkus.service;

import fr.psoi.training.quarkus.repository.entity.Person;

import java.util.List;

public interface PersonService {

    public void set(Person person);

    public Person get(Long id);

    public List<Person> list();

    public void delete(Long id);
}
