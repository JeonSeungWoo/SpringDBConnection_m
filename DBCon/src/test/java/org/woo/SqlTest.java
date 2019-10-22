package org.woo;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.woo.test.dao.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class SqlTest {

	@Inject
	private TestService service;

//	@Inject
//	private SqlSessionFactory sqlFactory;
//
//	@Test
//	public void testFactory() {
//		System.out.println("\n >>>>>>>>>> sqlFactory ��� : " + sqlFactory);
//	}
//
//	@Test
//	public void testSession() throws Exception {
//
//		try (SqlSession session = sqlFactory.openSession()) {
//
//			System.out.println(" >>>>>>>>>> session ��� : " + session + "\n");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	
	@Test
	public void testSql()throws Exception{
		System.out.println(service.time());
	}
	
	
	
	
	

}
