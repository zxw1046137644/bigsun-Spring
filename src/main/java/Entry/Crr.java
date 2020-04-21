package Entry;

public class Crr {

    public Crr(String name, Double price) {

        this.Name = name;
        this.price = price;
    }

    public Crr() {
    }

    public void setcName(String cName) {
        this.Name = cName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Crr{" +
                "cName='" + Name + '\'' +
                ", price=" + price +
                '}';
    }

    private String Name;
    private double price;
    private int age;


}
