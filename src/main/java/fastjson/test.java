package fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import day6.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    @Test
    public void test() {
        Fast fast = new Fast();
        List list = new ArrayList();
        Map map = new HashMap();
        list.add(new Fast("1", "2SS"));
        list.add(new Fast("2", "2S3S"));
        map.put("key1", "value1");
        map.put("key2", "value2");


        fast.setCorpId("sss");
        fast.setCorpName("社交恐惧");
        fast.setUser(new User[]{new User("zxw",2,222),new User("zzz",2,444)});


        String jsonString = JSON.toJSONString(fast, true);
        String jsonList = JSON.toJSONString(list, false);
        String jsonMap = JSON.toJSONString(map, false);
        System.out.println(jsonString);
        System.out.println(jsonList);
        System.out.println(jsonMap);
        JSONObject jsonObject = (JSONObject) JSON.parse(jsonString);
        JSONArray jsonObject1 = (JSONArray) JSON.parse(jsonList);
        JSONObject jsonObject2 = JSON.parseObject(jsonMap);

        System.out.println(jsonObject.get("user")+">>>>>>>>>>");
        System.out.println(jsonObject1);
        System.out.println(jsonObject2);

        JSONObject toJSONArray = (JSONObject) JSON.toJSON(fast);

//        System.out.println(toJSONArray);

    }
}
