package gxun.soft.homework_system.domain;

//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("student")
public class Student {
    private Integer stuId;
    private String stuName;
    private Integer classId;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
