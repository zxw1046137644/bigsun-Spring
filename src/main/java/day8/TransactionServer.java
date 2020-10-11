package day8;

public class TransactionServer {


    private TransactionDao transactionDao;

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public void transfer(long balance) {
        transactionDao.in(balance);
        int a = 1 / 0;
        transactionDao.out(balance);
    }

    public void syy(long balance) {
        System.out.println(balance + " ");
    }
}
