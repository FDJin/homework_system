package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper {
    //班级操作

    int addClass(@Param("myClass") Class myClass);

    int deleteClassById(@Param("classId") Integer classId);

    Class findClassByClassId(@Param("classId") Integer classId);

    List<Class> findClassByClassName(@Param("className") String className);

    List<Class> getAllClasses();
}
