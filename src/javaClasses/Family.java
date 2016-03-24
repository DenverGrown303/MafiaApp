package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name="Family.GetFamilyNameByGameID", query="SELECT familyName FROM Family f WHERE f.gameID = gameID"),
  @NamedQuery(name="Family.GetGameIDByFamilyName", query="SELECT gameID FROM Family f WHERE f.familyName = familyName")

})

@Table(name = "family")
public class Family{

  @Column(name="familyName")
  private String familyName;

  @Column(name="gameID")
  private int gameID;

  public Family(){
    this.familyName = familyName;
    this.gameID = gameID;
  }

  public void setFamilyName(String familyName){
    this.familyName = familyName;
  }

  public void setGameID(int gameID){
    this.gameID = gameID;
  }

  public String getFamilyName(){
    return this.familyName;
  }

  public int getGameID(){
    return this.gameID;
  }

}
