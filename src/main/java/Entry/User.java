package Entry;

public class User {
    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Crr car) {
        this.car = car;
    }

    public void setAge(int age) {
        System.out.println("设置属性值");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Crr getCar() {
        return car;
    }

    public void  init(){
        System.out.println("bean启动了");
    }
    public void  destroy(){
        System.out.println("bean销毁了");
    }

  public User(){
      System.out.println("空参构造器Bean初始化");
  }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    String name;
    int age;
    Crr car;

}
