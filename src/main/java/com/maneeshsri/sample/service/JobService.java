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
	
	
	/**
	 * 
	 * @param job
	 */
	public void createJob(Job job);
	
	
	/**
	 * 
	 * @return
	 */
	public int deleteAllJobs();

	
	/**
	 * 
	 * @param user
	 */
	public void updateJob(Job job);

	/**
	 * 
	 * @param job
	 */
	public void deleteJob(Job job);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Job getJob(Long id);

}
