package ch.fhnw.mscbis.premscis.blueprint.eewebapplication.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.fhnw.mscbis.premscis.blueprint.eewebapplication.domain.Person;

@Singleton
@Startup
public class PersonEJB {
	
	@PersistenceContext(unitName="primary")
	protected EntityManager em;
	
	@PostConstruct
	public void init()
	{
		Person person = new Person();
		person.setFirstName("Andreas");
		person.setLastName("Martin");
		em.persist(person);
	}

}
