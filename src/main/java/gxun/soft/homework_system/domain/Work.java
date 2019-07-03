package gxun.soft.homework_system.domain;

import springfox.documentation.spring.web.json.Json;

import java.util.Date;

//
//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("work")
public class Work {
    private Integer workId;
    private Integer teaId;
    private String workName;
    private Date startTime;
    private Date endTime;
    private Json correctAnswerList;

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Json getCorrectAnswerList() {
        return correctAnswerList;
    }

    public void setCorrectAnswerList(Json correctAnswerList) {
        this.correctAnswerList = correctAnswerList;
    }
}
