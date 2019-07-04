package gxun.soft.homework_system.service.impl;


import gxun.soft.homework_system.domain.Stu_work;
import gxun.soft.homework_system.mapper.Stu_workMapper;
import gxun.soft.homework_system.service.Stu_workService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Stu_workServiceImp implements Stu_workService {

    @Autowired
    Stu_workMapper stu_workMapper;

    @Override
    public int addStu_Work(Stu_work stu_work) {
        return stu_workMapper.addStu_Work(stu_work);
    }

    @Override
    public int updateStu_work(Stu_work stu_work) {
        return stu_workMapper.updateStu_work(stu_work);
    }

    @Override
    public List<Stu_work> findStu_workByWorkId(Integer workId) {
        return stu_workMapper.findStu_workByWorkId(workId);
    }

    @Override
    public List<Stu_work> findStuWorkByStuId(Integer stuId) {
        return stu_workMapper.findStuWorkByStuId(stuId);
    }

    @Override
    public List<Stu_work> getAllStu_works() {
        return stu_workMapper.getAllStu_works();
    }
}
