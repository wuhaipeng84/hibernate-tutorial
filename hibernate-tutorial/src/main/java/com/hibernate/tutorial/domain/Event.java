package com.hibernate.tutorial.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EVENTS")
public class Event {

	@Id
	@Column(name="EVENT_ID")
	private Long id;
	private String title;
	@Column(name="EVENT_DATE")
	private Date date;
	
	@OneToMany
	private Set<Person> participator = new HashSet<Person>();
	
	public Event() {}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * @return the participator
	 */
	public Set<Person> getParticipator() {
		return participator;
	}

	/**
	 * @param participator the participator to set
	 */
	public void setParticipator(Set<Person> participator) {
		this.participator = participator;
	}
}
