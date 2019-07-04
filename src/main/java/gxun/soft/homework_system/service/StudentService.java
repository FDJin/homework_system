package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Account;
import gxun.soft.homework_system.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    /**
     * 添加学生
     * @param studentMap
     * @return
     */
    int addStudent(Map studentMap);

    /**
     * 修改学生密码
     * @param account
     * @return
     */
    int updateStudentPassword(Account account);

    /**
     * 按stuId删除学生
     * @param stuId
     * @return
     */
    int deleteStudentByStudentId(Integer stuId);

    /**
     * 按stuId查找学生
     * @param stuId
     * @return
     */
    Student findStudentByStudentId(Integer stuId);

    /**
     * 按stuName查找学生
     * @param stuName
     * @return
     */
    List<Student> findStudentByStudentName(String stuName);

    /**
     * 按classId查找学生
     * @param classId
     * @return
     */
    List<Student> findStudentByClassId(Integer classId);

    /**
     * 按className查找学生
     * @param className
     * @return
     */
    List<Student> findStudentByClassName(String className);

    /**
     * 获取所有学生
     * @return
     */
    List<Student> getAllStudent();
}
