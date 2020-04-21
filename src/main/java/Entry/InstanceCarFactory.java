package Entry;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {


    Map<String, Crr> car = null;

    public InstanceCarFactory() {

        car = new HashMap<String, Crr>();
        car.put("BMW", new Crr("BMW", 2322.2));
        car.put("AUD", new Crr("AUD", 232.2));
    }


    public Crr getCar(String name) {
        return car.get(name);
    }
}
