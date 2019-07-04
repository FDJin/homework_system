package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.MyClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassMapper {
    //班级操作

    /**
     * 新增班级
     * @param myClass
     * @return
     */
    int addClass(@Param("myClass") MyClass myClass);

    /**
     * 按classId删除班级
     * @param classId
     * @return
     */
    int deleteClassByClassId(@Param("classId") Integer classId);

    /**
     * 按classId查找班级
     * @param classId
     * @return
     */
    MyClass findClassByClassId(@Param("classId") Integer classId);

    /**
     * 按className模糊查找班级
     * @param className
     * @return
     */
    List<MyClass> findClassByClassName(@Param("className") String className);

    /**
     * 获取所有班级
     * @return
     */
    List<MyClass> getAllClasses();
}
