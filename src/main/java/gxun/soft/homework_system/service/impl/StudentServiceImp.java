package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Stu_work;
import gxun.soft.homework_system.domain.Student;
import gxun.soft.homework_system.mapper.AccountMapper;
import gxun.soft.homework_system.mapper.StudentMapper;
import gxun.soft.homework_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    AccountMapper accountMapper;

    @Override
    public int addStudent(Map studentMap) {

        Student student = (Student) studentMap.get("student");
        Account account = (Account) studentMap.get("account");

        System.out.println(student.toString());
        System.out.println(account.toString());
        accountMapper.addAccount(account);
        studentMapper.addStudent(student);
        return 0;
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
