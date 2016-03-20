package javaClasses;

public class MafiaFamily {
	private String familyName;
	private String familyColor;
	private int userID;
	private int gameID;

	public MafiaFamily() {
		super();
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFamilyColor() {
		return this.familyColor;
	}

	public void setFamilyColor(String familyColor) {
		this.familyColor = familyColor;
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getGameID() {
		return this.gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

}
