package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name="Game.GetGameByGameID", query="SELECT userID FROM Game g WHERE g.gameID = gameID"),
  @NamedQuery(name="Game.GetGameByUserID", query="SELECT gameID FROM Game g WHERE g.userID = userID"),
  @NamedQuery(name="Game.GetGameByUserName", query="SELECT gameID FROM Game g WHERE g.userName = userName"),
  @NamedQuery(name="Game.GetGameByPassword", query="SELECT gameID FROM Game g WHERE g.password = password")
})

@Table(name="game")
public class Game{

  @Column(name="gameID")
  private int gameID;

  @Column(name="userID")
  private int userID;

  @Column(name="userName")
  private String userName;

  @Column(name="passWord")
  private String password;

  public Game(){
    this.gameID = gameID;
    this.userID = userID;
    this.userName = userName;
    this.password = password;
  }

  public void setGameID(int gameID){
    this.gameID = gameID;
  }

  public void setUserID(int userID){
    this.userID = userID;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public void setPassword(String password){
    this.password = password;
  }

}
