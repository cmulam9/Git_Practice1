package com.anilkm.SB_JPA_Composite.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class StudentEntity {
 @EmbeddedId
 private StudentComposite id;
 
 private String sName;
 private Integer marks;
public StudentComposite getId() {
	return id;
}
public void setId(StudentComposite id) {
	this.id = id;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
 
}
