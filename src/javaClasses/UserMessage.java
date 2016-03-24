package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
		@NamedQuery(name = "Email.GetInBox", query = "SELECT d FROM Email d WHERE d.recipientFirstName = firstName AND d.recipientLastName = lastName"),
		@NamedQuery(name = "Email.GetOutBox", query = "SELECT d FROM Email d WHERE d.senderFirstName = firstName AND d.senderLastName = lastName") })

@Table(name = "emails")
public class UserMessage {

	@Column(name = "subject")
	private String subject;

	@Column(name = "body")
	private String body;

	@Column(name = "closer")
	private String closer;

	@Column(name = "senderFirstName")
	private String senderFirstName;

	@Column(name = "senderLastName")
	private String senderLastName;

	@Column(name = "recipientFirstName")
	private String recipientFirstName;

	@Column(name = "recipientLastName")
	private String recipientLastName;
	
	@Column(name = "gameID")
	private int gameID;
	
	@Column(name = "userID")
	private int userID;

	public UserMessage() {
		this.subject = subject;
		this.body = body;
		this.closer = closer;
		this.senderFirstName = senderFirstName;
		this.senderLastName = senderLastName;
		this.recipientFirstName = recipientFirstName;
		this.recipientLastName = recipientLastName;
		this.gameID = gameID;
		this.userID = userID;
	}
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setCloser(String closer) {
		this.closer = closer;
	}

	public void setSenderFirstName(String firstName) {
		this.senderFirstName = firstName;
	}

	public void setSenderLastName(String lastName) {
		this.senderLastName = lastName;
	}

	public void setRecipientFirstName(String firstName) {
		this.recipientFirstName = firstName;
	}

	public void setRecipientLastName(String lastName) {
		this.recipientLastName = lastName;
	}

}
