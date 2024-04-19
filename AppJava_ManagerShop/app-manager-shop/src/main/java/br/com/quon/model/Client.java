package br.com.quon.model;

import java.util.Date;
import java.util.Objects;

public class Client {
	
	
	
	
	private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private Date birthDay;
	private String nameUser;
	private String userPassword;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setGender(String genter) {
		this.gender = genter;
	}
	public String getGender() {
		return gender;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(birthDay, firstName, gender, id, lastName, nameUser, userPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(birthDay, other.birthDay) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(gender, other.gender) && id == other.id && Objects.equals(lastName, other.lastName)
				&& Objects.equals(nameUser, other.nameUser) && Objects.equals(userPassword, other.userPassword);
	}
	

}
