package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherMapper {

    //教师操作

    int addTeacher(@Param("teacher") Teacher teacher);

    int updateTeacherPassword(@Param("teacher") Teacher teacher);

    int deleteTeacherByTeacherId(@Param("teaId") Integer teaId);

    Teacher findTeacherByTeacherId(@Param("teaId") Integer teaId);

    List<Teacher> findTeacherByTeacherName(@Param("teaName") String teaName);

    List<Teacher> findTeacherByClassId(@Param("classId") Integer classId);

    List<Teacher> getAllTeacher();
}
