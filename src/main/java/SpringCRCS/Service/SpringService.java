package SpringCRCS.Service;

import SpringCRCS.Repository.SpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringService {

    @Autowired
    private SpringRepository springRepository;

    public void service() {
        System.out.println("SpringService .....");
        springRepository.save();
    }
}
