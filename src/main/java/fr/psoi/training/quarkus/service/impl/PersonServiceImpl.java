package fr.psoi.training.quarkus.service.impl;

import fr.psoi.training.quarkus.repository.PersonRepository;
import fr.psoi.training.quarkus.repository.entity.Person;
import fr.psoi.training.quarkus.service.PersonService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PersonServiceImpl implements PersonService {

    @Inject
    private PersonRepository personRepository;

    @Transactional
    @Override
    public void set(Person person) {
        personRepository.set(person);
    }

    @Override
    public Person get(Long id) {
        return personRepository.get(id);
    }

    @Override
    public List<Person> list() {
        return personRepository.list();
    }

    @Transactional
    @Override
    public void delete(Long id) {
        personRepository.delete(id);
    }
}
