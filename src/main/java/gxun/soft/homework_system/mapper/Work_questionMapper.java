package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Work_question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Work_questionMapper {

    //作业-题目组成操作

    int addWork_question(Work_question work_question);

    int deleteWork_questionByWork_questionId(@Param("workQuestionId") Integer workQuestionId);

    Work_question findWork_questionByWork_questionId(@Param("workQuestionId") Integer workQuestionId);

    List<Work_question> findWork_QuestionByWorkId(@Param("workId") Integer workId);

    List<Work_question> findWork_QuestionByQuestionId(@Param("questionId") Integer questionId);

    List<Work_question> getAllWork_questions();

}
