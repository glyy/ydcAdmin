package domain.vo;

import java.util.Objects;

public class UserInfoVO implements Comparable<UserInfoVO>{
    private String userId;
    private String userName;
    private String userMobile;
    private String userRoleName;
    private String userDeptName;
    private String userStatus;

    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserMobile() {
        return userMobile;
    }
    public String getUserRoleName() {
        return userRoleName;
    }
    public String getUserDeptName() {
        return userDeptName;
    }

    public String getUserStatus() {
        return userStatus;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }
    public void setUserDeptName(String userDeptName) {
        this.userDeptName = userDeptName;
    }
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userMobile, userRoleName, userDeptName, userStatus);
    }
    @Override
    public int compareTo(UserInfoVO o) {
        if(Integer.valueOf(o.userId) < Integer.valueOf(userId)){
            return -1;
        }else if(Integer.valueOf(o.userId) > Integer.valueOf(userId)){
            return 1;
        }else{
            return 0;
        }
    }
}