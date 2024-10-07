package br.com.erudio.services;

import br.com.erudio.exceptions.ResourcesNotFoundException;
import br.com.erudio.model.Person;
import br.com.erudio.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
    PersonRepository repository;

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        return repository.findAll();
    }


    public Person findById(Long id) {
        logger.info("Finding one person!");

        return repository.findById(id)
                .orElseThrow(() -> new ResourcesNotFoundException("No records found for this ID!"));
    }

    public Person create(Person person) {
        logger.info("Creating a new person!");

        return repository.save(person);
    }

    public Person update(Person person) {
        logger.info("Updating one person!");
        Person entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourcesNotFoundException("No records found for this ID!"));

        person.setFirstName(person.getFirstName());
        person.setLastName(person.getLastName());
        person.setAddress(person.getAddress());
        person.setGender(person.getGender());

        return repository.save(person);
    }

    public void delete(Long id) {
        Person entity = repository.findById(id)
                .orElseThrow(() -> new ResourcesNotFoundException("No records found for this ID!"));

        repository.delete(entity);
        logger.info("Deleting one person!");
    }
}
