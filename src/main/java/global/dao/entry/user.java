package global.dao.entry;

public class user {

    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
