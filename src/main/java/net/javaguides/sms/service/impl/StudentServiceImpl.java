package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private net.javaguides.sms.repository.StudentRepository StudentRepository;
	@Override
	
	
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentServiceImpl(net.javaguides.sms.service.impl.StudentRepository studentRepository) {
		super();
		StudentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
		
	}
}