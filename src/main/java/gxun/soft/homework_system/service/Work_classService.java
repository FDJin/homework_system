package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Work_class;

import java.util.List;

public interface Work_classService {

    /**
     * 添加作业分发情况
     * @param work_class
     * @return
     */
    int addWork_class(Work_class work_class);

    /**
     * 按workId查找作业分发情况
     * @param workId
     * @return
     */
    List<Work_class> findWork_ClassByWorkId(Integer workId);

    /**
     * 按classId查找作业分发情况
     * @param classId
     * @return
     */
    List<Work_class> findWork_ClassByClassId(Integer classId);
}
