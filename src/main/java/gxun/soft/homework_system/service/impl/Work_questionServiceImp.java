package gxun.soft.homework_system.service.impl;

import gxun.soft.homework_system.domain.Work_question;
import gxun.soft.homework_system.mapper.Work_questionMapper;
import gxun.soft.homework_system.service.Work_questionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Work_questionServiceImp implements Work_questionService {

    @Autowired
    Work_questionMapper work_questionMapper;

    @Override
    public int addWork_question(Work_question work_question){
        return work_questionMapper.addWork_question(work_question);
    }

    @Override
    public List<Work_question> findWork_QuestionByWorkId(Integer workId){
        return work_questionMapper.findWork_QuestionByWorkId(workId);
    }

    @Override
    public List<Work_question> findWork_QuestionByQuestionId(Integer questionId){
        return work_questionMapper.findWork_QuestionByQuestionId(questionId);
    }

    @Override
    public List<Work_question> getAllWork_questions(){
        return work_questionMapper.getAllWork_questions();
    }
}
