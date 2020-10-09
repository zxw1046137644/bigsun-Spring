package fastjson;

import day6.User;

public class Fast {


    private String phoneNum;
    private String password;
    private String corpId;
    private String corpName;
    private User[] user;

    public User[] getUser() {
        return user;
    }

    public void setUser(User[] user) {
        this.user = user;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }



    public Fast(String phoneNum, String password) {
        this.phoneNum = phoneNum;
        this.password = password;
    }

    public Fast() {
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public String getCorpId() {
        return corpId;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    @Override
    public String toString() {
        return "Fast{" +
                "phoneNum='" + phoneNum + '\'' +
                ", password='" + password + '\'' +
                ", corpId='" + corpId + '\'' +
                ", corpName='" + corpName + '\'' +
                '}';
    }
}
