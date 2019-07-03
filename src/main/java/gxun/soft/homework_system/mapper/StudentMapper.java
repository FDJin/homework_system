package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Student;

import java.util.List;

public interface StudentMapper {
    int addStudent(Student student);
    int updateStudentPassword(Student student);
    int deleteStudentById(Integer id);
    Student findStudentById(Integer id);
    List<Student> getAllStudent();
}
