package day5.Controller;

import day5.Service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("doctc")
public class SpringController {

    @Autowired
    private SpringService springService;

    public void add() {
        springService.service();
        System.out.println("SpringController ....");
    }

}
