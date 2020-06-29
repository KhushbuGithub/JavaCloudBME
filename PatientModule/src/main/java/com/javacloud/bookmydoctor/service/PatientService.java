package com.javacloud.bookmydoctor.service;

import java.util.List;

import com.javacloud.bookmydoctor.dto.Patient;

public interface PatientService {
	public boolean addPatient(Patient patient,int id);

	public Patient serarchPatient(int patientId);

	public List<Patient> getAllPatients();

	public boolean deletePatient(int patientId);
	
	public boolean modifyPatient(Patient bean);

}
