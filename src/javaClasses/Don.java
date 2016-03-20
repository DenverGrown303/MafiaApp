package javaClasses;

import java.util.List;

public class Don {
	private String name;
	private int age;
	private List<String> priors;
	private String familyName;

	public Don() {
		this.name = name;
		this.age = age;
		this.priors = priors;
		this.familyName = familyName;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPriors(List<String> Priors) {
		this.priors = priors;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getName() {
		return this.name;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public int getAge() {
		return this.age;
	}

	public List<String> getPriors() {
		return this.priors;
	}

	public Don gimmeAName(String name) {
		Don johnson = new Don();
		johnson.setDonLastNameForTestingPurposes("Pelham");

		return johnson;
	}

	public void setDonLastNameForTestingPurposes(String name) {
		this.name = name;
	}

}
