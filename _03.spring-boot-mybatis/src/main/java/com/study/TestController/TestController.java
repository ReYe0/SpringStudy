package com.study.TestController;

import com.study.entity.Student;
import com.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping( value = "/querystudent/{sno}", method = RequestMethod.GET)
	public Student queryStudentBySno(@PathVariable("sno") String sno) {
		return this.studentService.queryStudentBySno(sno);
	}
}
