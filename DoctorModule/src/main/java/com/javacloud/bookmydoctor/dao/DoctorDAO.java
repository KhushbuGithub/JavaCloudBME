package com.javacloud.bookmydoctor.dao;

import java.util.List;

import com.javacloud.bookmydoctor.dto.Doctor;

public interface DoctorDAO {

	public boolean addDoctor(Doctor bean, int id);

	public boolean deleteDoctor(int doctorId);

	public List<Doctor> getAllDoctors();

	public List<Doctor> searchDoctor(String city);

	public boolean modifyDoctor(Doctor bean);

	public Doctor serarchDoctor(int doctorId);

}
