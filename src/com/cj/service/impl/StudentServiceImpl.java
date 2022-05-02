package com.cj.service.impl;

import com.cj.dao.StudentDao;
import com.cj.domain.Student;
import com.cj.service.StudentService;
import com.cj.utils.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSqlSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> list = studentDao.getAll();
        return list;
    }
}
