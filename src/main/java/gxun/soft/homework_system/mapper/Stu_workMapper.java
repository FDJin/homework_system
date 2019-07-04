package gxun.soft.homework_system.mapper;


import gxun.soft.homework_system.domain.Stu_work;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Stu_workMapper {

    //学生答题情况操作

    int addStu_Work(@Param("stu_work") Stu_work stu_work);

    int deleteStu_workById(@Param("stu_workId") Integer stu_workId);

    int updateStu_work(@Param("Stu_work") Stu_work stu_work);

    //以stu_workId查找学生答题记录
    Stu_work findStu_workByStu_workId(@Param("stu_workId") Integer stu_workId);

    //以workId查找学生答题记录
    List<Stu_work> findStu_workByWorkId(@Param("workId") Integer workId);

    //以stuId查找学生答题记录
    List<Stu_work> findStuWorkByStuId(@Param("stuId") Integer stuId);

    //获取全部学生答题记录
    List<Stu_work> getAllStu_works();
}
