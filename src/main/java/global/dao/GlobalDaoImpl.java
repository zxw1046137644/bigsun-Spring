package global.dao;

import Entry.User;

import java.util.List;
import java.util.Map;

public class GlobalDaoImpl implements GlobalDao {
    private List<String> nameList;
    private Map<String,Object> nameMap;
    private List<User> userList;

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setNameMap(Map<String, Object> nameMap) {
        this.nameMap = nameMap;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public void saveGlobalDao() {
        System.out.println(nameList);
        System.out.println(nameMap.get("3"));
        System.out.println(userList);
        System.out.println("globalDao的操作");
    }
}
