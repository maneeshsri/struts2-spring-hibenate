package com.maneeshsri.sample.service;

import java.util.List;

import com.maneeshsri.sample.model.Job;

/**
 * 
 * @author maneeshkumar
 *
 */

public interface JobService {
	
	/**
	 * 
	 * @return
	 */
	public List<Job> getAllJobs() ;
	
	
	public Job getJob(Long id);
	
	public List<String> getAllStates();
	
	public List<String> getAllFunctions();
	
	public List<Job> getJobsByStateFunction(String state, String function);
}
