package pl.edu.wroc.pwr.ds.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wroc.pwr.ds.graphql.data.PersonDAO;
import pl.edu.wroc.pwr.ds.graphql.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleQueryResolver  implements GraphQLQueryResolver {

    private PersonDAO personDAO;

    @Autowired
    public PeopleQueryResolver(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public Person getPerson(String id) {
        return this.personDAO.getPerson(id);
    }

    public List<Person> getPeople(){
        return new ArrayList<>(this.personDAO.getPeople());
    }

}
