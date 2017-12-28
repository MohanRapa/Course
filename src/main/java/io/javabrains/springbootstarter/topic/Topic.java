package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
private String id;
private String name;
private String descreption;

public Topic() {
	
}

public Topic(String id, String name, String descreption) {
	super();
	this.id = id;
	this.name = name;
	this.descreption = descreption;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescreption() {
	return descreption;
}
public void setDescreption(String descreption) {
	this.descreption = descreption;
}
	
}
