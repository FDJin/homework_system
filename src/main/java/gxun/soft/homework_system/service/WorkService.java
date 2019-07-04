package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Work;
import java.util.List;

public interface WorkService {
    /**
     * 新增作业
     * @param work
     * @return
     */
    int addWork(Work work);

    /**
     * 按workId删除作业
     * @param workId
     * @return
     */
    int deleteWorkByWorkId(Integer workId);

    /**
     * 按workId查找作业
     * @param workId
     * @return
     */
    Work findWorkByWorkId(Integer workId);

    /**
     *按teacherId查找作业
     * @param teaId
     * @return
     */
    List<Work> finWorkByTeacherId(Integer teaId);

    /**
     * 按workName查找作业
     * @param workName
     * @return
     */
    List<Work> findWorkByWorkName(String workName);

    /**
     * 获取所有作业
     * @return
     */
    List<Work> getAllWorks();
}
