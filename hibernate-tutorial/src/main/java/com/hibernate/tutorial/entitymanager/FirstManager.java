package com.hibernate.tutorial.entitymanager;

import java.util.Date;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.tutorial.domain.Event;
import com.hibernate.tutorial.domain.Person;

public class FirstManager {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tutorial");
		EntityManager em = emf.createEntityManager();
		Event e = new Event();
		e.setId(1L);
		e.setDate(new Date());
		e.setTitle("title");
		em.persist(e);

		Event e2 = new Event();
		e2.setId(2L);
		e2.setDate(new Date());
		e2.setTitle("title2");
		em.persist(e2);
		
		Person p = new Person();
		p.setId(1L);
		p.setFirstName("firstName");
		p.setLastName("lastName");
		p.getEvents().add(e);
		p.getEvents().add(e2);
		em.persist(p);
		
		Person saved = em.find(Person.class, 1L);
		System.out.println(saved.getFirstName());
		System.out.println(saved.getLastName());
		Set<Event> events = saved.getEvents();
		for(Event se : events) {
			System.out.println(se.getId());
			System.out.println(se.getTitle());
		}
		
		em.close();
		emf.close();
	}
}
