package com.cj.dao;

import com.cj.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student getById(String id);

    public void save(Student student);

    List<Student> getAll();

    Student select1(String s);

    Student select2(Map<String, String> map);

    List<Map<String, Object>> select3();

    Student select4(String s);

    List<Map<String, Object>> select5(String s);

    List<Map<String, Object>> select6(String s);

    List<Student> select7();

    List<Student> select8();
}
