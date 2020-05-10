package AOP.fivetongzhi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QianZhiImpl implements QianZhiInterface{

    @Override
    public List get(int i, int j) {

        List list = new ArrayList();
        list.add(i);
        list.add(j);
        return list;
    }

    @Override
    public int add(int i, int j)
    {
        System.out.println(i/0);
        return i+j;
    }
}
