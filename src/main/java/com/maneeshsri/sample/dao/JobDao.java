package com.maneeshsri.sample.dao;

import java.util.List;

import com.maneeshsri.sample.model.Job;


/**
 * 
 * @author maneeshkumar
 *
 */
public interface JobDao {
	
	
     /**
      * 
      * @param job
      */
	 public void create(Job job) ;
	
	/**
	 * 
	 * @return
	 */
	 public List<Job> findAll();
	 
	/**
	 * 
	 * @param userId
	 * @return
	 */
	 public Job findById(Long jobId);
	 

     /**
      * 
      * @param user
      */
	 public void update(Job job);
	 
	/**
	 * 
	 * @param job
	 */
	 public void delete(Job job);
	 
	 
	 
	 /**
	  * 
	  * @return
	  */
	 public int deleteAll();
	 
	 /**
	  * 
	  * @return
	  */
	 public List<String> getAllStates();
	 
	 /**
	  * 
	  * @return
	  */
	 public List<String> getAllJobFunctions();
	 
	 
	 /**
	  * 
	  * @param state
	  * @param jobFunction
	  * @return
	  */
	 public List<Job> findByStateAndFunction(String state, String function);
	 
	 
	
}
