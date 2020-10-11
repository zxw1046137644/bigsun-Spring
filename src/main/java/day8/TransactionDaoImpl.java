package day8;

import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionDaoImpl implements TransactionDao {


    private JdbcTemplate jdbcTemplate;

    public TransactionDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void in(Long balance) {
        jdbcTemplate.update("update user set balance=balance+? where id=?", balance, 1);
    }

    @Override
    public void out(Long balance) {
        jdbcTemplate.update("update user set balance=balance-? where id=?", balance, 2);
    }
}
