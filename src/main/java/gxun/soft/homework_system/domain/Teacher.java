package gxun.soft.homework_system.domain;

//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("teacher")
public class Teacher {
    private Integer teaId;
    private String teaName;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }
}
