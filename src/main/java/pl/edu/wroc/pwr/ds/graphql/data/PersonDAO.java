package pl.edu.wroc.pwr.ds.graphql.data;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.edu.wroc.pwr.ds.graphql.models.Person;

import java.util.*;

@Component
@Scope("singleton")
public class PersonDAO {

    private Map<String, Person> people;

    public PersonDAO() {
        this.people  = new HashMap<>();
        people.put("p1", new Person("p1", "John", "Doe"));
        people.put("p2", new Person("p2", "Jane", "Doe"));
        people.put("p3", new Person("p3", "Adam", "Smith"));
    }

    public Person getPerson(String id){
        return people.get(id);
    }

    public Collection<Person> getPeople() {
        return people.values();
    }
}
