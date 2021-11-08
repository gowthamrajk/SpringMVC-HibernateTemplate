package com.gowthamrajk.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.gowthamrajk.model.Doctor;

@Component
@Transactional
public class DoctorService {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void addNewDoctor(Doctor doctor) {  
		
	    hibernateTemplate.persist(doctor);
    }
    
    public void updateDoctor(Doctor doctor) {  
		
    	if(getDoctorById(doctor.getDoctorId()).equals(doctor))
		    hibernateTemplate.update(doctor);
		else
    		System.out.println("Doctor not found !!!, Please add the Doctor to the Database !!!");
	}
	
    public void deleteDoctor(Doctor doctor) {  
		
    	if(getDoctorById(doctor.getDoctorId()).equals(doctor))
		    hibernateTemplate.delete(doctor);
    	else
    		System.out.println("Doctor not found !!!, Please add the Doctor to the Database !!!");
	}
    
    public Doctor getDoctorById(int doctorId) {
    	
    	return hibernateTemplate.get(Doctor.class, doctorId);
    }
	
	public List<Doctor> getAllDoctor() { 
		
	    return hibernateTemplate.loadAll(Doctor.class);  
	}  
}
