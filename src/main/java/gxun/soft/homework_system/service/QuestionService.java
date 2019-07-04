package gxun.soft.homework_system.service;

import gxun.soft.homework_system.domain.Question;

import java.util.List;

public interface QuestionService {


    /**
     * 为题库新增题目
     * @param question
     * @return
     */
    int addQuestion(Question question);

    /**
     * 按questionId删除题目
     * @param questionId
     * @return
     */
    int deleteQuestionByQuestionId(Integer questionId);

    /**
     * 按questionId查找题目
     * @param questionId
     * @return
     */
    Question findQuestionByQuestionId(Integer questionId);

    /**
     * 按questionType查找题目 0：选择题  1：填空题  2：简答题
     * @param questionType
     * @return
     */
    List<Question> getQuestionsByQuestionType(Integer questionType);


    /**
     * 获取所有题目
     * @return
     */
    List<Question> getAllQuestions();

}
