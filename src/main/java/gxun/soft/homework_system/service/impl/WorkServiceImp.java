package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Work;
import gxun.soft.homework_system.mapper.WorkMapper;
import gxun.soft.homework_system.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WorkServiceImp implements WorkService {

    @Autowired
    WorkMapper workMapper;

    @Override
    public int addWork(Work work){
        return workMapper.addWork(work);
    }

    @Override
    public int updateWorkNameByWorkId(Integer workId, String workName){
        return workMapper.updateWorkNameByWorkId(workId,workName);
    }

    @Override
    public int updateWorkEndTimeByWorkId(Integer workId, Date endTime){
        return workMapper.updateWorkEndTimeByWorkId(workId,endTime);
    }

    @Override
    public int deleteWorkByWorkId(Integer workId){
        return workMapper.deleteWorkByWorkId(workId);
    }

    @Override
    public Work findWorkByWorkId(Integer workId){
        return workMapper.findWorkByWorkId(workId);
    }

    @Override
    public List<Work> finWorkByTeacherId(Integer teaId){
        return workMapper.finWorkByTeacherId(teaId);
    }

    @Override
    public List<Work> findWorkByWorkName(String workName){
        return workMapper.findWorkByWorkName(workName);
    }

    @Override
    public List<Work> getAllWorks(){
        return workMapper.getAllWorks();
    }
}
