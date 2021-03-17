package market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class test {
    @Autowired
    private testc3p0 t;

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate= (JdbcTemplate) context.getBean("jdbcTemplate");
        String sql="select a.test from test a where a.test='1'";
        int rows=jdbcTemplate.queryForObject(sql,int.class);
        System.out.println(rows);

    }
}
