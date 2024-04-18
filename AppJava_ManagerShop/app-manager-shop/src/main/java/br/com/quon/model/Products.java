package br.com.quon.model;

import java.util.Date;
import java.util.Objects;

public class Products {
	
	
	private long id;
	private String name;
	private String classification;
	private Date validity;
	private String description;
	
	
	long getId() {
		return id;
	}
	void setId(long id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getClassification() {
		return classification;
	}
	void setClassification(String classification) {
		this.classification = classification;
	}
	Date getValidity() {
		return validity;
	}
	void setValidity(Date validity) {
		this.validity = validity;
	}
	String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(classification, description, id, name, validity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(classification, other.classification) && Objects.equals(description, other.description)
				&& id == other.id && Objects.equals(name, other.name) && Objects.equals(validity, other.validity);
	}
	
	
	

}
