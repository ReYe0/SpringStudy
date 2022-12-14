package com.study.service;


import com.study.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
	int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
    List<Map<String, Object>> queryStudentListMap();
}
