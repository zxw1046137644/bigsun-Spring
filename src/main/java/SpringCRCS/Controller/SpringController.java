package SpringCRCS.Controller;

import SpringCRCS.Service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SpringController {

    @Autowired
    private SpringService springService;

    public void add() {
        springService.service();
        System.out.println("SpringController ....");
    }

}
