package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Question;
import gxun.soft.homework_system.mapper.QuestionMapper;
import gxun.soft.homework_system.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionServiceImp implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Override
    public int addQuestion(Question question) {
        return questionMapper.addQuestion(question);
    }

    @Override
    public int deleteQuestionByQuestionId(Integer questionId) {
        return questionMapper.deleteQuestionByQuestionId(questionId);
    }

    @Override
    public Question findQuestionByQuestionId(Integer questionId) {
        return questionMapper.findQuestionByQuestionId(questionId);
    }

    @Override
    public List<Question> getQuestionsByQuestionType(Integer questionType) {
        return questionMapper.getQuestionsByQuestionType(questionType);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionMapper.getAllQuestions();
    }
}
