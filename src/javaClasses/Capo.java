package javaClasses;

import java.util.ArrayList;
import java.util.List;

public class Capo {
	private String name;
	private String familyName;
	private List<Soldier> crew;
	private List<String> priors;
	private String specialty;
	private int age;

	//constructor
	public Capo() {
		Don johnson = new Don();
		johnson.setDonLastNameForTestingPurposes("Tester McPelham");
		this.name = name;
		this.familyName = familyName;
		this.crew = new ArrayList<>();
		this.priors = new ArrayList<>();
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPriors(List<String> priors) {
		this.priors = priors;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setCrew(List<Soldier> crew) {
		this.crew = crew;
	}

	public String getName() {
		return this.name;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public List<Soldier> getCrew() {
		return this.crew;
	}

	public int getAge() {
		return this.age;
	}

	public List<String> getPriors() {
		return this.priors;
	}

	public String getSpecialty() {
		return this.specialty;
	}

}