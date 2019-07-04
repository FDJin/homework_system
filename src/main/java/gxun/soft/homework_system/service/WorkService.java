package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Work;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WorkService {
    /**
     * 新增作业
     * @param work
     * @return
     */
    int addWork(Work work);

    int updateWorkNameByWorkId(Integer workId, String workName);

    /**
     * 按workId更改作业结束时间
     * @param workId
     * @param endTime
     * @return
     */
    int updateWorkEndTimeByWorkId(Integer workId,Date endTime);
    /**
     * 按workId删除作业
     * @param workId
     * @return
     */

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
