package com.study.service.Impl;


import com.study.dao.StudentDao;
import com.study.entity.Student;
import com.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public int add(Student student) {
		return this.studentDao.add(student);
	}

	@Override
	public int update(Student student) {
		return this.studentDao.update(student);
	}

	@Override
	public int deleteBysno(String sno) {
		return this.studentDao.deleteBysno(sno);
	}

	@Override
	public Student queryStudentBySno(String sno) {
		return this.studentDao.queryStudentBySno(sno);
	}
	@Override
	public List<Map<String, Object>> queryStudentListMap() {
		return this.studentDao.queryStudentsListMap();
	}
}
