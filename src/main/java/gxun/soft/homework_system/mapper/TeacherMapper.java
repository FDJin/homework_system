package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Teacher;

import java.util.List;

public interface TeacherMapper {
    int addTeacher(Teacher teacher);
    int updateTeacherPassword(Teacher teacher);
    int deleteTeacherById(Integer id);
    Teacher findTeacherById(Integer id);
    List<Teacher> getAllTeacher();
}
