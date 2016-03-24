package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name="Job.GetOpenJobs", query="SELECT a FROM Jobs a WHERE a.complete = false"),
  @NamedQuery(name="Job.GetJobsByUserID", query="SELECT a FROM Jobs a WHERE a.userID = userID"),
  @NamedQuery(name="Job.GetNextJob", query="SELECT u FROM Jobs u WHERE u.goonFirstName IS NULL AND u.goonLastName IS NULL AND u.jobNumber = number")
})

@Table(name="jobs")
public class Job{

  @Column(name = "jobNumber")
  private int jobNumber;

  @Column(name = "userID")
  private int userID;

  @Column(name = "gameID")
  private int gameID;

  @Column(name = "request")
  private String request;

  @Column(name = "consequence")
  private String consequence;

  @Column(name = "complete")
  private boolean complete;

  @Column(name = "goonFirstName")
  private String goonFirstName;

  @Column(name = "goonLastName")
  private String goonLastName;

  public Job(){
    this.jobNumber = jobNumber;
    this.userID = userID;
    this.gameID = gameID;
    this.goonFirstName = goonFirstName;
    this.goonLastName = goonLastName;
    this.request = request;
    this.consequence = consequence;
    this.complete = false;
  }

  public void setJobNumber(int jobNumber){
    this.jobNumber = jobNumber;
  }

  public void setUserID(int userID){
    this.userID = userID;
  }

  public void setGameID(int gameID){
    this.gameID = gameID;
  }

  public void setRequest(String request){
    this.request = request;
  }

  public void setConsequence(String consequence){
    this.consequence = consequence;
  }

  public void setComplete(boolean complete){
    this.complete = complete;
  }

  public void setGoonFirstName(String firstName){
    this.goonFirstName = firstName;
  }

  public void setGoonLastName(String lastName){
    this.goonLastName = lastName;
  }

  public int getJobNumber(){
    return this.jobNumber;
  }

  public String getRequest(){
    return this.request;
  }

  public String getConsequence(){
    return this.consequence;
  }

  public boolean GetComplete(){
    return this.complete;
  }

  public void completeJob(){
    this.complete = true;
  }

  public int getUserID(){
    return this.userID;
  }

  public int getGameID(){
    return this.gameID;
  }

  public String getGoonFirstName(){
    return this.goonFirstName;
  }

  public String getGoonLastName(){
    return this.goonLastName;
  }
}
