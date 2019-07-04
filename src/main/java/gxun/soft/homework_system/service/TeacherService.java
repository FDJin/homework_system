package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     * 添加教师
     * @param teacher
     * @return
     */
    int addTeacher(Teacher teacher);

    /**
     * 修改教师密码
     * @param account
     * @return
     */
    int updateTeacherPassword(Account account);

    /**
     * 按teaId删除教师
     * @param teaId
     * @return
     */
    int deleteTeacherByTeacherId(Integer teaId);

    /**
     * 按teaId查找教师
     * @param teaId
     * @return
     */
    Teacher findTeacherByTeacherId(Integer teaId);

    /**
     * 按teaName查找教师
     * @param teaName
     * @return
     */
    List<Teacher> findTeacherByTeacherName(String teaName);

    /**
     * 按classId查询教师
     * @param classId
     * @return
     */
    List<Teacher> findTeacherByClassId(Integer classId);

    /**
     * 获取所有教师
     * @return
     */
    List<Teacher> getAllTeacher();

}
