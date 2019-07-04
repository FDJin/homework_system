package gxun.soft.homework_system.domain;

//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("class")
public class Class {
    private Integer classId;
    private String className;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }
}
