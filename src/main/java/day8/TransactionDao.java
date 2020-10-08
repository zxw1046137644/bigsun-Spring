package day8;

public interface TransactionDao {

    void in(Long balance,Long id);

    void out(Long balance,Long id);

}
