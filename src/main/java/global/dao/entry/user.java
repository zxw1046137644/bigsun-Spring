package global.dao.entry;

import java.util.Date;

public class user {

    private int age;
    private String name;
    private String account;
    private double balance;
    private String password;
    private Date creatTime;


    public user() {
        this.creatTime = new Date();
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

}
