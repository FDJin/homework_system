package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.MyClass;
import gxun.soft.homework_system.mapper.ClassMapper;
import gxun.soft.homework_system.service.MyClassService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyClassServiceImp implements MyClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public int addClass(MyClass myClass) {
        return classMapper.addClass(myClass);
    }

    @Override
    public int deleteClassByClassId(Integer classId) {
        return classMapper.deleteClassByClassId(classId);
    }

    @Override
    public MyClass findClassByClassId(Integer classId) {
        return classMapper.findClassByClassId(classId);
    }

    @Override
    public List<MyClass> findClassByClassName(@Param("className") String className) {
        return classMapper.findClassByClassName(className);
    }

    @Override
    public List<MyClass> getAllClasses() {
        return classMapper.getAllClasses();
    }
}
