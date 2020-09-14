package day6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("autowiredservice")
public class AutowiredService {


    @Autowired
    private User user;

    public void getUser(){
        user.setName("autowiredservice");
        System.out.println(user);
    }
}
