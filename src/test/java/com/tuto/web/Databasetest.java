package com.tuto.web;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class Databasetest {

/*	@Test
	public void testConnnection() throws Exception{
		String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://192.168.219.178:3306/test_schema2";
        String user = "test1";
        String pw = "";
        
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pw);
        
        log.info(con + "");
        
        con.close();
	}*/
	
	@Autowired
	DataSource dataSource;
	
	@Test
	public void testSayHello() throws Exception {
		log.info(dataSource.getConnection() + "");
	}
	
}
