package schoolExceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception{
	Person Person;
	
	public PersonException(Person Person, String message) {
			super(message);
			this.Person = Person;
		} 
}