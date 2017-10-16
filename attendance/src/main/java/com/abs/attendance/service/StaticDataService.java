package com.abs.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abs.attendance.model.Classes;
import com.abs.attendance.model.Students;
import com.abs.attendance.repository.StudentRepository;
import com.abs.attendance.service.Intf.IStaticDataService;

@Service
public class StaticDataService implements IStaticDataService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Students> findAllStudents() {
		return this.studentRepo.findAll();
	}

	@Override
	public List<Students> findAllStudentsInClass(final Classes division) {
		return this.studentRepo.findStudentsByClasses(division);
	}

}
