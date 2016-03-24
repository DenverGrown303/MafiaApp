package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;

@Entity
@NamedQueries({

})
public class Favor{

  @Column(name="userID")
  private int userID;

  @Column(name="gameID")
  private int gameID;

  @Column(name="jobID")
  private int jobID;

  @Column(name="favorContents")
  private String favorContents;

  @Column(name="goonFirstName")
  private String goonFirstName;

  @Column(name="goonLastName")
  private String goonLastName;

  @Column(name="goonRank")
  private String goonRank;

  @Column(name="goonFamilyName")
  private String goonFamilyName;

  public Favor(){
    this.userID = userID;
    this.gameID = gameID;
    this.jobID = jobID;
    this.favorContents = favorContents;
    this.goonFirstName = goonFirstName;
    this.goonLastName = goonLastName;
    this.goonFamilyName = goonFamilyName;
  }

  public void setUserID(int userID){
    this.userID = userID;
  }

  public void setJobID(int jobID){
    this.jobID = jobID;
  }

  public void setGameID(int gameID){
    this.gameID = gameID;
  }

  public void setFavorContents(String favorContents){
    this.favorContents = favorContents;
  }

  public void setGoonFirstName(String name){
    this.goonFirstName = name;
  }

  public void setGoonLastName(String name){
    this.goonLastName = name;
  }

  public void setGoonFamilyName(String name){
    this.goonFamilyName = goonFamilyName;
  }

  public String getGoonFamilyName(){
    return this.goonFamilyName;
  }

  public String getGoonFirstName(){
    return this.goonFirstName;
  }

  public String getGoonLastName(){
    return this.goonLastName;
  }

  public String getGoonRank(){
    return this.goonRank;
  }

  public int getUserID(){
    return this.userID;
  }

  public int getGameID(){
    return this.gameID;
  }

  public int getJobID(){
    return this.jobID;
  }

}
