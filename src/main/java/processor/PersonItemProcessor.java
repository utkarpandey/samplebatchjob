package processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import entity.Person;

@Component
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(final Person person) throws Exception {
		final String firstName = person.getFirstName().toUpperCase();
		final String lastName = person.getLastName().toUpperCase();

		final Person transformedPerson = new Person(firstName, lastName);

		return transformedPerson;
	}

}
