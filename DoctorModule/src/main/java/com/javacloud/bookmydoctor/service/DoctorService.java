package com.javacloud.bookmydoctor.service;

import java.util.List;

import com.javacloud.bookmydoctor.dto.Doctor;

public interface DoctorService {
	public boolean addDoctor(Doctor bean, int id);

	public boolean deleteDoctor(int doctorId);

	public List<Doctor> getAllDoctors();

	public List<Doctor> searchDoctor(String city);

	public boolean modifyDoctor(Doctor bean);

	public Doctor serarchDoctor(int doctorId);

}
