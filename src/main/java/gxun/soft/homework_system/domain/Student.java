package gxun.soft.homework_system.domain;

//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("student")
public class Student {
    private Integer stuId;
    private Integer classId;
    private String stuName;

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

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", classId=" + classId +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
