package com.anilkm.SB_JPA_Composite.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class StudentComposite {
	@Column(name="RNo")
	private Integer rno;
	
	@Column(name="SECTION")
	private String section;

	public Integer getRno() {
		return rno;
	}

	public void setRno(Integer rno) {
		this.rno = rno;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	

}
