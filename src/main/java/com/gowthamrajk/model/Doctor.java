package com.gowthamrajk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  
public class Doctor {
	
	@Id
	@Column(name = "doctorid")
	private int doctorId;
	
	@Column(name = "doctorname")
	private String doctorName;
	
	private String email;
	private String specialization;
	private int experience;
	
	public Doctor() { }

	public Doctor(int doctorId, String doctorName, String email, String specialization, int experience) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.email = email;
		this.specialization = specialization;
		this.experience = experience;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		
		return "Doctor Details => Doctor ID : " + doctorId + ", Doctor Name : " + doctorName + ", Email : " 
		        + email + ", Specializaion : " + specialization + ", Experience : " + experience + " years";
	}
}
