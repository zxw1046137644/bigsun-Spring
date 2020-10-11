package day8;

public interface TransactionDao {

    void in(Long balance);

    void out(Long balance);

}
