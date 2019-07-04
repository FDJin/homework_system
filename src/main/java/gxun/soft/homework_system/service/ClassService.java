package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Class;
import java.util.List;

public interface ClassService {

    /**
     * 新增班级
     * @param myClass
     * @return
     */
    int addClass(Class myClass);

    /**
     * 按classId删除班级
     * @param classId
     * @return
     */
    int deleteClassByClassId(Integer classId);

    /**
     * 按classId查找班级
     * @param classId
     * @return
     */
    Class findClassByClassId(Integer classId);

    /**
     * 按班级名查找班级
     * @param className
     * @return
     */
    List<Class> findClassByClassName(String className);

    /**
     * 获取所有班级
     * @return
     */
    List<Class> getAllClasses();
}
