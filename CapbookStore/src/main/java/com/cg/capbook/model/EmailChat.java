package com.cg.capbook.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class EmailChat {

	@Id
	@SequenceGenerator(name="email_seq",sequenceName="email_seq",initialValue=1001,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="email_seq")
	private int emailChatId;
	private String fromAddress;
	private String toAddress;
	private String subject;
	private String messageBody;
	private Date dateOfMail;
	public EmailChat() {
		super();
	}
	public EmailChat(int emailChatId, String fromAddress, String toAddress, String subject, String messageBody, Date dateOfMail) {
		super();
		this.emailChatId = emailChatId;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.subject = subject;
		this.messageBody = messageBody;
		this.dateOfMail = dateOfMail;
	}
	
	public int getEmailChatId() {
		return emailChatId;
	}
	public void setEmailChatId(int emailChatId) {
		this.emailChatId = emailChatId;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	
	public Date getDateOfMail() {
		return dateOfMail;
	}
	public void setDateOfMail(Date dateOfMail) {
		this.dateOfMail = dateOfMail;
	}
	
	@Override
	public String toString() {
		return "EmailChat [emailChatId=" + emailChatId + ", fromAddress=" + fromAddress + ", toAddress=" + toAddress
				+ ", subject=" + subject + ", messageBody=" + messageBody + ", dateOfMail=" + dateOfMail + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfMail == null) ? 0 : dateOfMail.hashCode());
		result = prime * result + emailChatId;
		result = prime * result + ((fromAddress == null) ? 0 : fromAddress.hashCode());
		result = prime * result + ((messageBody == null) ? 0 : messageBody.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((toAddress == null) ? 0 : toAddress.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailChat other = (EmailChat) obj;
		if (dateOfMail == null) {
			if (other.dateOfMail != null)
				return false;
		} else if (!dateOfMail.equals(other.dateOfMail))
			return false;
		if (emailChatId != other.emailChatId)
			return false;
		if (fromAddress == null) {
			if (other.fromAddress != null)
				return false;
		} else if (!fromAddress.equals(other.fromAddress))
			return false;
		if (messageBody == null) {
			if (other.messageBody != null)
				return false;
		} else if (!messageBody.equals(other.messageBody))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (toAddress == null) {
			if (other.toAddress != null)
				return false;
		} else if (!toAddress.equals(other.toAddress))
			return false;
		return true;
	}
	
	
	
	
}