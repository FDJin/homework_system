package gxun.soft.homework_system.mapper;

import gxun.soft.homework_system.domain.Question;

public interface QuestionMapper {
    int addQuestion(Question question);
    int deleteQuestionById(Integer id);
    Question findQuestionById();
}
