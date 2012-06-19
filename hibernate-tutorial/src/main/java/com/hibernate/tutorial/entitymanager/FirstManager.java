package com.hibernate.tutorial.entitymanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.tutorial.domain.Event;

public class FirstManager {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tutorial");
		EntityManager em = emf.createEntityManager();
		Event event = em.find(Event.class, new Long(1L));
		em.close();
		emf.close();
		System.out.println(event.getTitle());
		System.out.println(event.getDate());
	}
}
