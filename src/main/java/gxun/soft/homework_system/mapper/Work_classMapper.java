package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Work_class;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Work_classMapper {

    //作业分发操作

    /**
     * 添加作业分发情况
     * @param work_class
     * @return
     */
    int addWork_class(@Param("work_class") Work_class work_class);

    /**
     * 按workId查找作业分发情况
     * @param workId
     * @return
     */
    List<Work_class> findWork_ClassByWorkId(@Param("workId") Integer workId);

    /**
     * 按classId查找作业分发情况
     * @param classId
     * @return
     */
    List<Work_class> findWork_ClassByClassId(@Param("classId") Integer classId);
}
