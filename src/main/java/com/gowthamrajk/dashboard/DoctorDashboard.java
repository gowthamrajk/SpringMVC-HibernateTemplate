package com.gowthamrajk.dashboard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gowthamrajk.model.Doctor;
import com.gowthamrajk.service.DoctorService;

public class DoctorDashboard {

	public static void main(String[] args) {

		ApplicationContext contextObj = new ClassPathXmlApplicationContext("spring-hibernate-configuration.xml");
		
		DoctorService serviceObj = contextObj.getBean("doctorService", DoctorService.class);
		
		serviceObj.addNewDoctor(contextObj.getBean("doctor1", Doctor.class));
		serviceObj.addNewDoctor(contextObj.getBean("doctor2", Doctor.class));
		
		System.out.println("\nAfter Inserting New Doctor\n");
		for(Doctor doctorObj : serviceObj.getAllDoctor()) {
		    System.out.println(doctorObj);
		}
		
		serviceObj.updateDoctor(new Doctor(101, "doctor1updated", "doctor1updated@gmail.com", "CARDIOLOGY", 12));
		
		System.out.println("\nAfter Updating a Doctor\n");
		for(Doctor doctorObj : serviceObj.getAllDoctor()) {
		    System.out.println(doctorObj);
		}
		
		serviceObj.deleteDoctor(contextObj.getBean("doctor2", Doctor.class));
		
		System.out.println("\nAfter Deleting a Doctor\n");
		for(Doctor doctorObj : serviceObj.getAllDoctor()) {
		    System.out.println(doctorObj);
		}
		
		System.out.println("\nSearch By Doctor Id\n");
		System.out.print(serviceObj.getDoctorById(101));
		
	}
}
