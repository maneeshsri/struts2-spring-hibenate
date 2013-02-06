package com.maneeshsri.sample.service;

import java.util.List;

import com.maneeshsri.sample.dao.JobDao;
import com.maneeshsri.sample.model.Job;


public class JobServiceImpl implements JobService {

	private JobDao jobDao;

	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	public Job getJob(Long id) {
		return jobDao.findById(id);
	}

	public List<Job> getAllJobs() {
		return jobDao.findAll();
	}

	public List<String> getAllStates(){
		return jobDao.getAllStates();
	}

	public List<String> getAllFunctions(){
		return jobDao.getAllJobFunctions();
	}

	public List<Job> getJobsByStateFunction(String state, String function){
		return jobDao.findByStateAndFunction(state, function);
	}


}
