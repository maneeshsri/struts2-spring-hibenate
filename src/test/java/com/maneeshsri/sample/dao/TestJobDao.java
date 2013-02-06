package com.maneeshsri.sample.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maneeshsri.sample.model.Job;





@ContextConfiguration(locations={"classpath:applicationContextTest.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJobDao {
	private static final Logger logger = Logger.getLogger(TestJobDao.class.getName());
	
	@Autowired
	JobDao userDao ;
	
	@Test
	public void testFindAll() {
		List<Job> jobs = userDao.findAll();
		logger.info("Number of users found in table is " + jobs.size() );
		//assertEquals("Number of users in table is not 6", 6, jobs.size() );
	}
	

}
