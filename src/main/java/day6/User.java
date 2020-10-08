package day6;

public class User {
    private String name;
    private Long id;
    private Long balance;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }
}
