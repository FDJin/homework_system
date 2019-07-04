package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Work_class;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Work_classMapper {

    //作业分发操作

    int addWork_class(@Param("work_class") Work_class work_class);

    int deleteWork_classByWork_classId(@Param("workClassId") Integer workClassId);

    //查看单次作业分发情况
    Work_class findWork_ClassByWork_classId(@Param("workClassId") Integer workClassId);

    //按workId查看作业分发情况
    List<Work_class> findWork_ClassByWorkId(@Param("workId") Integer workId);

    //按classId查看作业分发情况
    List<Work_class> findWork_ClassByClassId(@Param("classId") Integer classId);
}
