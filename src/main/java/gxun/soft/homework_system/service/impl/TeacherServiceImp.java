package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Teacher;
import gxun.soft.homework_system.mapper.AccountMapper;
import gxun.soft.homework_system.mapper.TeacherMapper;
import gxun.soft.homework_system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImp implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;
    AccountMapper accountMapper;

    @Override
    @Transactional
    public int addTeacher(Map teacherMap) {
        Account account = (Account) teacherMap.get("account");
        Teacher teacher = (Teacher) teacherMap.get("teacher");
        accountMapper.addAccount(account);
        teacherMapper.addTeacher(teacher);
        return 0;
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
