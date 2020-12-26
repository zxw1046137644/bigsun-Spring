package day9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServer {

    @Autowired
    private TransactionDao transactionDao;

//    public void setTransactionDao(TransactionDao transactionDao) {
//        this.transactionDao = transactionDao;
//    }

    @Transactional
    public void transfer(long balance) {
        transactionDao.in(balance);
//        int a = 1 / 0;
        transactionDao.out(balance);
    }

    public void syy(long balance) {
        System.out.println(balance + " ");
    }
}
