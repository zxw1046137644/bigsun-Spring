package SpringCRCS.Repository;



import org.springframework.stereotype.Repository;

@Repository("springRepository")
public class SpringRepositoryImpl implements SpringRepository {


    @Override
    public void save() {
        System.out.println("SpringRepositoryImpl save ....");
    }
}
