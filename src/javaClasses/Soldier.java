package javaClasses;

import java.util.ArrayList;
import java.util.List;

public class Soldier{
  private String name;
  private String capoName;
  private String familyName;
  private List<String> priors;
  private String specialty;
  private int age;

  public Soldier(){
    this.name = "Pelham";
    this.capoName = "Aaron";
    this.familyName = "SkillDisillerenzo";
    this.priors = new ArrayList<>();
    this.specialty = specialty;
    this.age = age;
  }

  public String getfamilyName(){
    return this.familyName;
  }

  public List<String> getPriors(){
    return this.priors;
  }

  public String getSpecialty(){
    return this.specialty;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public String getCapoName(){
    return this.capoName;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setSpecialty(String specialty){
    this.specialty = specialty;
  }

  public void setPriors(List<String> priors){
    this.priors = priors;
  }

  public void setCapoName(String capoName){
    this.capoName = capoName;
  }

  public void setFamilyName(String familyName){
    this.familyName = familyName;
  }

  public void setName(String name){
    this.name = name;
  }

}
