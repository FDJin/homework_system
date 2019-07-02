package gxun.soft.homework_system.domain;

import com.baomidou.mybatisplus.annotations.TableName;

@TableName("tea_work")
public class Tea_work {
    private Integer teaWorkId;
    private Integer teaId;
    private Integer workId;
    private Integer classId;

    public Integer getTeaWorkId() {
        return teaWorkId;
    }

    public void setTeaWorkId(Integer teaWorkId) {
        this.teaWorkId = teaWorkId;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
