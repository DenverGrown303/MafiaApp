package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//baseline java mafia member class

@Entity
@NamedQueries({
  @NamedQuery(name="Member.GetSoldiersByCapo", query="SELECT m FROM Member m WHERE m.rank = soldier AND m.capoFirstName = capoFirstName AND m.capoLastName = capoLastName"),
  @NamedQuery(name="Member.GetCapoByDon", query="SELECT firstName, lastName FROM Member m WHERE m.rank = capo AND m.donName = donName"),
  @NamedQuery(name="Member.GetByRank", query="SELECT d FROM Member d WHERE d.rank= rank"),
  @NamedQuery(name="Member.GetBySoldierNumber", query="SELECT a FROM Member a WHERE a.soldierNumber = number"),
  @NamedQuery(name="Member.GetAll", query="SELECT m FROM Member m WHERE m.familyName = NOT NULL AND m.rank NOT NULL"),
  @NamedQuery(name="Member.GetUnassigned", query="SELECT M FROM Member m WHERE m.familyName IS NULL AND m.rank IS NULL")
})
@Table(name="reserves")
public class Member{
  @Column(name="firstName")
  private String firstName;

  @Column(name="lastName")
  private String lastName;

  @Column(name="age")
  private int age;

  @Column(name="rank")
  private String rank;

  @Column(name="specialty")
  private String specialty;

  @Column(name="familyName")
  private String familyName;

  @Column(name="capoFirstName")
  private String capoFirstName;

  @Column(name="capoLastName")
  private String capoLastName;

  @Column(name="imageLocation")
  private String imageLocation;

  public Member(){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.rank = rank;
    this.familyName = familyName;
    this.capoFirstName = capoFirstName;
    this.capoLastName = capoLastName;
    this.specialty = specialty;
    this.imageLocation = imageLocation;
  }

  public String getSpecialty() {
	return specialty;
}

public void setSpecialty(String specialty) {
	this.specialty = specialty;
}

public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setRank(String rank){
    this.rank = rank;
  }

  public void setFamilyName(String familyName){
    this.familyName = familyName;
  }

  public void setCapoFirstName(String firstName){
    this.capoFirstName = firstName;
  }

  public void setCapoLastName(String lastName){
    this.capoLastName = lastName;
  }

  public void setImageLocation(String imageLocation){
    this.imageLocation = imageLocation;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getRank(){
    return this.rank;
  }

  public String getFamilyName(){
    return this.familyName;
  }

  public String getCapoFirstName(){
    return this.capoFirstName;
  }

  public String getCapoLastName(){
    return this.capoLastName;
  }

  public String getImageLocation(){
    return this.imageLocation;
  }

  public int getAge(){
    return this.age;
  }
}
