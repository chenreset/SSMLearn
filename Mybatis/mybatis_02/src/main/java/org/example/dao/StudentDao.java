package org.example.dao;

import org.example.domain.Student;

public interface StudentDao {
    Student selectStudentById(Integer id);
}
