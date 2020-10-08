package day8;

public class TransactionServer {


    private TransactionDao transactionDao;

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public void transfer(long balance, long id) {
        transactionDao.in(balance, id);
        transactionDao.out(balance, id);
    }

    public void syy(long balance, long id) {
        System.out.println(balance + " " + id);
    }
}
