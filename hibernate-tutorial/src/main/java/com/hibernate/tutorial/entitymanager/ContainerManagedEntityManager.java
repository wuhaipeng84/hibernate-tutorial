package com.hibernate.tutorial.entitymanager;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hibernate.tutorial.domain.Event;

public class ContainerManagedEntityManager {

	@PersistenceContext(unitName="tutorial")
	EntityManager em;
	
	public void save() {
		Event e = new Event();
		e.setId(1L);
		e.setDate(new Date());
		e.setTitle("title");
		em.persist(e);
	}
	
}
