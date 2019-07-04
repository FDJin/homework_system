package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Class;
import gxun.soft.homework_system.mapper.ClassMapper;
import gxun.soft.homework_system.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImp implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public int addClass(Class myClass) {
        return classMapper.addClass(myClass);
    }

    @Override
    public int deleteClassByClassId(Integer classId) {
        return classMapper.deleteClassByClassId(classId);
    }

    @Override
    public Class findClassByClassId(Integer classId) {
        return classMapper.findClassByClassId(classId);
    }

    @Override
    public List<Class> findClassByClassName(String className) {
        return classMapper.findClassByClassName(className);
    }

    @Override
    public List<Class> getAllClasses() {
        return classMapper.getAllClasses();
    }
}
