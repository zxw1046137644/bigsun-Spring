package day9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class TransactionDaoImpl implements TransactionDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void in(Long balance) {
        jdbcTemplate.update("update user set balance=balance+? where id=?", balance, 1);
    }

    @Override
    public void out(Long balance) {
        jdbcTemplate.update("update user set balance=balance-? where id=?", balance, 2);
    }
}
