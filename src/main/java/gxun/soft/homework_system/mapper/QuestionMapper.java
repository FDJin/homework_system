package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuestionMapper {
    //题目操作

//    新增题目
    int addQuestion(@Param("question") Question question);

//    按题目id删除题目
    int deleteQuestionByQuestionId(@Param("questionId") Integer questionId);

//    按题目id查询题目
    Question findQuestionByQuestionId(@Param("questionId") Integer questionId);

//    按questionType查找题目
    List<Question> getQuestionsByQuestionType(@Param("questionType") Integer questionType);

//    获取全部题目
    List<Question> getAllQuestions();
}
