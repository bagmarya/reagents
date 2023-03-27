package com.chemical.reagents;

//import com.chemical.reagents.config.DbConfig;
import com.chemical.reagents.dao.ChemistDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class DbConfigTest {
  private static Logger logger = LoggerFactory.getLogger(ChemistDao.class);

//  @Test
//  public void testDataSource() throws SQLException {
//    GenericApplicationContext ctx =
//        new AnnotationConfigApplicationContext(
//            DbConfig.class);
//    DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
//    assertNotNull(dataSource);
//    Connection connection = null;
//    try {
//      connection = dataSource.getConnection();
//      PreparedStatement statement =
//          connection.prepareStatement("SELECT now()");
//      ResultSet resultSet = statement.executeQuery();
//      resultSet.next ();
//      resultSet.getDate("now");
//      statement.close();
//    } catch (Exception e) {
//      logger.info("Something unexpected happened");
//    } finally {
//      if (connection != null) {
//        connection.close();
//      }
//    }
//    ctx.close();
//  }

  }
