package gxun.soft.homework_system.domain;

import springfox.documentation.spring.web.json.Json;

//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("question")
public class Question {
    private Integer questionId;
    private String questionType;
    private Integer score;
    private Json details;
    private Json answer;
    private Json correctAnswer;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Json getDetails() {
        return details;
    }

    public void setDetails(Json details) {
        this.details = details;
    }

    public Json getAnswer() {
        return answer;
    }

    public void setAnswer(Json answer) {
        this.answer = answer;
    }

    public Json getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Json correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
