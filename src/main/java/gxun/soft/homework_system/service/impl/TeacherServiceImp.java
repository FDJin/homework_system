package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Teacher;
import gxun.soft.homework_system.mapper.AccountMapper;
import gxun.soft.homework_system.mapper.TeacherMapper;
import gxun.soft.homework_system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherServiceImp implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;
    AccountMapper accountMapper;

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    @Override
    public int updateTeacherPassword(Account account) {
        return accountMapper.updatePassword(account);
    }

    @Override
    public int deleteTeacherByTeacherId(Integer teaId) {
        return teacherMapper.deleteTeacherByTeacherId(teaId);
    }

    @Override
    public Teacher findTeacherByTeacherId(Integer teaId) {
        return teacherMapper.findTeacherByTeacherId(teaId);
    }

    @Override
    public List<Teacher> findTeacherByTeacherName(String teaName) {
        return teacherMapper.findTeacherByTeacherName(teaName);
    }

    @Override
    public List<Teacher> findTeacherByClassId(Integer classId) {
        return teacherMapper.findTeacherByClassId(classId);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherMapper.getAllTeacher();
    }
}
