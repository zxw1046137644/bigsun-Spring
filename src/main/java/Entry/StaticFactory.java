package Entry;

import java.util.HashMap;
import java.util.Map;

public class StaticFactory {
    /**
     * 静态工厂配置bean
     */
    private static Map<String, Crr> car = new HashMap<String, Crr>();

    static {

    }

    public static Crr getCar(String name) {
        car.put("BMW", new Crr("BMW", 22222.2));
        car.put("aud", new Crr("aud", 3333.2));
        return car.get(name);
    }


}
