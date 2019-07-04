package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Work_class;
import gxun.soft.homework_system.mapper.Work_classMapper;
import gxun.soft.homework_system.service.Work_classService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Work_classServiceImp implements Work_classService {

    @Autowired
    Work_classMapper work_classMapper;

    @Override
    public int addWork_class(Work_class work_class){
        return work_classMapper.addWork_class(work_class);
    }

    @Override
    public List<Work_class> findWork_ClassByWorkId(Integer workId){
        return work_classMapper.findWork_ClassByWorkId(workId);
    }

    @Override
    public List<Work_class> findWork_ClassByClassId(Integer classId){
        return work_classMapper.findWork_ClassByClassId(classId);
    }
}
