package gxun.soft.homework_system.mapper;


import gxun.soft.homework_system.domain.Stu_work;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Stu_workMapper {

    //学生答题情况操作

    /**
     * 新增答题记录
     * @param stu_work
     * @return
     */
    int addStu_Work(@Param("stu_work") Stu_work stu_work);

    /**
     * 更新答题记录,可更新 分数、答题状态、答题答案
     * @param stu_work
     * @return
     */
    int updateStu_work(@Param("Stu_work") Stu_work stu_work);

    /**
     *以workId查找学生答题记录
     * @param workId
     * @return
     */
    List<Stu_work> findStu_workByWorkId(@Param("workId") Integer workId);

    /**
     * 按stuId查找答题记录
     * @param stuId
     * @return
     */
    List<Stu_work> findStuWorkByStuId(@Param("stuId") Integer stuId);

    /**
     * 获取全部答题记录
     * @return
     */
    List<Stu_work> getAllStu_works();
}
