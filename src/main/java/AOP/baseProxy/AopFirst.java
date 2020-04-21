package AOP.baseProxy;

public class AopFirst implements AopInterface{


    @Override
    public int get(int i ,int j){
        int sum = i+j;
        return sum;
    }

    @Override
    public int add(int i, int j) {
        return 0;
    }
}
