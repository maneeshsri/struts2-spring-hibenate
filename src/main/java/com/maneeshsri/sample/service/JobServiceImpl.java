package com.maneeshsri.sample.service;

import java.util.List;

import com.maneeshsri.sample.dao.JobDao;
import com.maneeshsri.sample.model.Job;


public class JobServiceImpl implements JobService {
	
	private JobDao jobDao;
	

	
	public Job getJob(Long id) {
		
		return jobDao.findById(id);
		
	}

	
	public List<Job> getAllJobs() {
		
		return jobDao.findAll();
		
	}
	
	
	public void createJob(Job Job) {
		
		jobDao.create(Job);
		
	}
	
	
	public void deleteJob(Job Job) {
		
		jobDao.delete(Job);
		
	}
	
	
	public int deleteAllJobs() {
		
		return jobDao.deleteAll();
		
	}
	
	
	public void updateJob(Job Job) {
		
		jobDao.update(Job);
		
	}

	public JobDao getJobDao() {
		return jobDao;
	}

	public void setJobDao(JobDao JobDao) {
		this.jobDao = JobDao;
	}









}
