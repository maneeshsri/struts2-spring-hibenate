package com.maneeshsri.sample.service;

import static org.junit.Assert.*;


import java.util.List;



import org.apache.log4j.Logger;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maneeshsri.sample.model.Job;
import com.maneeshsri.sample.service.JobService;





@ContextConfiguration(locations={"classpath:applicationContextTest.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJobService {
	
	@Autowired
	JobService jobService ;
	
	private static final Logger logger = Logger.getLogger(TestJobService.class.getName() );
	


	@Test
	public void testFindAll() {
		List<Job> jobs = jobService.getAllJobs();
		logger.info("Number of jobs found in table is " + jobs.size() );
		//assertEquals("Number of jobs in table is not 6", 6, jobs.size() );		
	}
	
	
	

}
