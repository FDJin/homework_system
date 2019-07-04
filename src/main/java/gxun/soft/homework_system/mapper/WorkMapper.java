package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Work;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkMapper {

    //作业操作

    int addWork(@Param("work") Work work);

    int deleteWorkByWorkId(@Param("workId") Integer workId);

    Work findWorkByWorkId(@Param("workId") Integer workId);

    List<Work> finWorkByTeacherId(@Param("teaId") Integer teaId);

    List<Work> findWorkByWorkName(@Param("workName") String workName);

    List<Work> getAllWorks();

}
