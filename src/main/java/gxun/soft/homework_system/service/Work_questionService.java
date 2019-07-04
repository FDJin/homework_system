package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Work_question;

import java.util.List;

public interface Work_questionService {

    /**
     * 新增作业题目
     * @param work_question
     * @return
     */
    int addWork_question(Work_question work_question);

    /**
     * 按workId查找作业题目
     * @param workId
     * @return
     */
    List<Work_question> findWork_QuestionByWorkId(Integer workId);

    /**
     * 按questionId查找作业题目
     * @param questionId
     * @return
     */
    List<Work_question> findWork_QuestionByQuestionId(Integer questionId);

    /**
     * 查找所有作业题目
     * @return
     */
    List<Work_question> getAllWork_questions();
}
