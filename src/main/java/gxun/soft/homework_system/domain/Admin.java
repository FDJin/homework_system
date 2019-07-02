package gxun.soft.homework_system.domain;

//import com.baomidou.mybatisplus.annotations.TableName;
//
//@TableName("admin")
public class Admin {
    private Integer adminId;
    private String adminName;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
}
