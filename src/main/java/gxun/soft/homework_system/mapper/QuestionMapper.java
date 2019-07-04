package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuestionMapper {
    //题目操作

    int addQuestion(@Param("question") Question question);

    int deleteQuestionById(@Param("questionId") Integer questionId);

    Question findQuestionById(@Param("questionId") Integer questionId);

    //按questionType查找题目
    List<Question> getQuestionsByQuestionType(@Param("questionType") Integer questionType);

    //获取一页数量的题目
    List<Question> getOnePageQuestions();

    //获取全部题目
    List<Question> getAllQuestions();
}
