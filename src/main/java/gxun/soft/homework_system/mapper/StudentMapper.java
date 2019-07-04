package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {

    //学生操作
    int addStudent(@Param("student") Student student);

    int deleteStudentById(@Param("stuId") Integer stuId);

    Student findStudentByStudentId(@Param("stuId") Integer stuId);

    List<Student> findStudentByStudentName(@Param("stuName") String stuName);

    List<Student> findStudentByClassId(@Param("classId") Integer classId);

    List<Student> findStudentByClassName(@Param("className") String className);

    List<Student> getAllStudent();
}
