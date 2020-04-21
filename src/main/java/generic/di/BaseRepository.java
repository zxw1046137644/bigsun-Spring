package generic.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class BaseRepository<T> {

    public void add(){
        System.out.println("baseRepository..");
    }



}
