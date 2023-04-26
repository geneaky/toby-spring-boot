package toy.helloboot;

import java.sql.Connection;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;

@JdbcTest
public class DataSourceTest {
    
    @Autowired
    DataSource dataSource;
    
    @Test
    void connect() throws Exception {
        Connection connection = dataSource.getConnection();
        connection.close();
    }
}
