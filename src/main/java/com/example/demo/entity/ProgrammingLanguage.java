package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int votes;

	// Default constructor
	public ProgrammingLanguage() {
	}

	// Parameterized constructor
	public ProgrammingLanguage(String name, int votes) {
		this.name = name;
		this.votes = votes;
	}

	// Getter for id
	public Long getId() {
		return id;
	}

	// Setter for id
	public void setId(Long id) {
		this.id = id;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for votes
	public int getVotes() {
		return votes;
	}

	// Setter for votes
	public void setVotes(int votes) {
		this.votes = votes;
	}
}