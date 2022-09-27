package com.study.controller;

import com.study.entity.Student;
import com.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping( value = "/querystudent/{sno}", method = RequestMethod.GET)
	public Student queryStudentBySno(@PathVariable("sno") String sno) {
		return this.studentService.queryStudentBySno(sno);
	}

	@RequestMapping(value = "/queryallstudent")
	public List<Map<String, Object>> queryAllStudent() {
		return this.studentService.queryStudentListMap();
	}

	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public int saveStudent(String sno,String name,String sex) {
		Student student = new Student();
		student.setSno(sno);
		student.setName(name);
		student.setSex(sex);
		return this.studentService.add(student);
	}

	@RequestMapping(value = "/deletestudent/{sno}", method = RequestMethod.GET)
	public int deleteStudentBySno(@PathVariable("sno") String sno) {
		return this.studentService.deleteBysno(sno);
	}
}
