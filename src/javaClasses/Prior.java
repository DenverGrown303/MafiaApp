package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name="Priors.GetPriorsByName", query="SELECT prior FROM PRIORS p WHERE p.firstName = firstName AND p.lastName = lastName")
  
})

@Table(name="Priors")
public class Prior{

  @Column(name="prior")
  private String prior;

  @Column(name="firstName")
  private String firstName;

  @Column(name="lastName")
  private String lastName;

  public Prior(){
    this.prior = prior;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setPrior(String prior){
    this.prior = prior;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public String getPrior(){
    return this.prior;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }
}
