package com.hibernate.tutorial.entitymanager;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.tutorial.domain.Event;

public class FirstManager {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tutorial");
		EntityManager em = emf.createEntityManager();
		Event e = new Event();
		e.setId(1L);
		e.setDate(new Date());
		e.setTitle("title");
		em.persist(e);
		
		Event saved = em.find(Event.class, 1L);
		System.out.println(saved.getTitle());
	}
}
