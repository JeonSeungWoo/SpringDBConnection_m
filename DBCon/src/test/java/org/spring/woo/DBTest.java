package org.spring.woo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DBTest {

	
//	@Test
//	public void DBConnectionTest() throws Exception {
//	Class.forName("oracle.jdbc.driver.OracleDriver");
//	Connection con = DriverManager.getConnection(
//	"jdbc:oracle:thin:@192.168.0.33:1521:myoracle",
//	"ora_user",
//	"woo");
//	System.out.println(con);
//	con.close();
//	}
	
	@Test
	public void DBConnectionTest() throws Exception {
	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection(
	"jdbc:postgresql://localhost:5432/postgres",
	"postgres",
	"1234");
	System.out.println(con);
	con.close();
	}
	

}
