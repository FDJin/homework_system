package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuestionMapper {
    //题目操作

    /**
     * 为题库新增题目
     * @param question
     * @return
     */
    int addQuestion(@Param("question") Question question);

    /**
     * 按questionId删除题目
     * @param questionId
     * @return
     */
    int deleteQuestionByQuestionId(@Param("questionId") Integer questionId);

    /**
     * 按questionId查找题目
     * @param questionId
     * @return
     */
    Question findQuestionByQuestionId(@Param("questionId") Integer questionId);

    /**
     * 按questionType查找题目 0：选择题  1：填空题  2：简答题
     * @param questionType
     * @return
     */
    List<Question> getQuestionsByQuestionType(@Param("questionType") Integer questionType);

    /**
     * 按questionType，以及模糊questionName查找题目 0：选择题  1：填空题  2：简答题
     * @param questionType
     * @return
     */
    List<Question> getQuestionsByQuestionNameAndType(@Param("questionName") String questionName,@Param("questionType") Integer questionType);

    /**
     * 获取所有题目
     * @return
     */
    List<Question> getAllQuestions();
}
