package market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class testc3p0 {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add() {
        String sql="select a.test from test a where a.test='1'";
        int rows=jdbcTemplate.queryForObject(sql,int.class);
        System.out.println(rows);
    }


}
