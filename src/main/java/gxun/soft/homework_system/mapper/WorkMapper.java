package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Work;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface WorkMapper {

    //作业操作

    /**
     * 新增作业
     * @param work
     * @return
     */
    int addWork(@Param("work") Work work);

    /**
     * 按workId更改作业名
     * @param workId
     * @return
     */
    int updateWorkNameByWorkId(@Param("workId") Integer workId, @Param("workName") String workName);

    /**
     * 按workId更改作业结束时间
     * @param workId
     * @param endTime
     * @return
     */
    int updateWorkEndTimeByWorkId(@Param("workId") Integer workId, @Param("endTime")Date endTime);
    /**
     * 按workId删除作业
     * @param workId
     * @return
     */
    int deleteWorkByWorkId(@Param("workId") Integer workId);

    /**
     * 按workId查找作业
     * @param workId
     * @return
     */
    Work findWorkByWorkId(@Param("workId") Integer workId);

    /**
     *按teacherId查找作业
     * @param teaId
     * @return
     */
    List<Work> finWorkByTeacherId(@Param("teaId") Integer teaId);

    /**
     * 按workName查找作业
     * @param workName
     * @return
     */
    List<Work> findWorkByWorkName(@Param("workName") String workName);

    /**
     * 获取所有作业
     * @return
     */
    List<Work> getAllWorks();

}
