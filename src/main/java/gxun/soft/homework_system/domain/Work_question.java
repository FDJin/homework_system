package gxun.soft.homework_system.domain;

import com.baomidou.mybatisplus.annotations.TableName;

@TableName("work_question")
public class Work_question {
    private Integer workQuestionId;
    private Integer questionId;
    private Integer workId;
    private String correctAnswerList;

    public Integer getWorkQuestionId() {
        return workQuestionId;
    }

    public void setWorkQuestionId(Integer workQuestionId) {
        this.workQuestionId = workQuestionId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public String getCorrectAnswerList() {
        return correctAnswerList;
    }

    public void setCorrectAnswerList(String correctAnswerList) {
        this.correctAnswerList = correctAnswerList;
    }
}
