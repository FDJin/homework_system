package gxun.soft.homework_system.domain;

import springfox.documentation.spring.web.json.Json;

//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("stu_work" )
public class Stu_work {
    private Integer stuWorkId;
    private Integer workId;
    private Integer stuId;
    private Integer questionType;
    private Integer score;
    private Json answerList;
    private Integer status;

    public Integer getStuWorkId() {
        return stuWorkId;
    }

    public void setStuWorkId(Integer stuWorkId) {
        this.stuWorkId = stuWorkId;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Json getAnswerList() {
        return answerList;
    }

    public void setAnswerList(Json answerList) {
        this.answerList = answerList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
