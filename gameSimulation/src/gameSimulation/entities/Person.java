package gameSimulation.entities;

import java.time.LocalDate;

import gameSimulation.business.abstracts.Entity;

public class Person implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private LocalDate dateOfBirth;
	private String department;
	
	public Person() {
	}

	public Person(int id, String firstName, String lastName, String nationalIdentity, LocalDate dateOfBirth,
			String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department.toLowerCase();
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
