package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Work_class;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Work_classMapper {

    //作业分发操作

    int addWork_class(@Param("work_class") Work_class work_class);

    //按workId查看作业分发情况
    List<Work_class> findWork_ClassByWorkId(@Param("workId") Integer workId);

    //按classId查看作业分发情况
    List<Work_class> findWork_ClassByClassId(@Param("classId") Integer classId);
}
