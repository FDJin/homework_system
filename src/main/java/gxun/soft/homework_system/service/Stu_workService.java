package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Stu_work;

import java.util.List;

public interface Stu_workService {


    /**
     * 新增答题记录
     * @param stu_work
     * @return
     */
    int addStu_Work(Stu_work stu_work);

    /**
     * 更新答题记录,可更新 分数、答题状态、答题答案
     * @param stu_work
     * @return
     */
    int updateStu_work(Stu_work stu_work);

    /**
     *以workId查找学生答题记录
     * @param workId
     * @return
     */
    List<Stu_work> findStu_workByWorkId(Integer workId);

    /**
     * 按stuId查找答题记录
     * @param stuId
     * @return
     */
    List<Stu_work> findStuWorkByStuId(Integer stuId);

    /**
     * 获取全部答题记录
     * @return
     */
    List<Stu_work> getAllStu_works();
}
