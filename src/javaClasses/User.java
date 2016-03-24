package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@NamedQueries({

//TODO: need some names queries
})

@Table(name="user")
public class User{

  @Column(name="userName")
  private String userName;

  @Column(name="password")
  private String password;

  @Column(name="gameID")
  private int gameID;

  @Column(name="userID")
  private int userID;

  public User(){
    this.userName = userName;
    this.password = password;
    this.gameID = gameID;
    this.userID = userID;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public void setGameID(int gameID){
    this.gameID = gameID;
  }

  public void setUserID(int userID){
    this.userID = userID;
  }

  public String getUserName(){
    return this.userName;
  }

  public int getGameID(){
    return this.gameID;
  }

  public int getUserID(){
    return this.userID;
  }
}
