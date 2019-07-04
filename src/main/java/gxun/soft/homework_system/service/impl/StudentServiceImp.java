package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Student;
import gxun.soft.homework_system.mapper.AccountMapper;
import gxun.soft.homework_system.mapper.StudentMapper;
import gxun.soft.homework_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImp implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    AccountMapper accountMapper;

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updateStudentPassword(Account account) {
        return accountMapper.updatePassword(account);
    }

    @Override
    public int deleteStudentByStudentId(Integer stuId) {
        return studentMapper.deleteStudentByStudentId(stuId);
    }

    @Override
    public Student findStudentByStudentId(Integer stuId) {
        return studentMapper.findStudentByStudentId(stuId);
    }

    @Override
    public List<Student> findStudentByStudentName(String stuName) {
        return studentMapper.findStudentByStudentName(stuName);
    }

    @Override
    public List<Student> findStudentByClassId(Integer classId) {
        return studentMapper.findStudentByClassId(classId);
    }

    @Override
    public List<Student> findStudentByClassName(String className) {
        return studentMapper.findStudentByClassName(className);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAllStudent();
    }
}
