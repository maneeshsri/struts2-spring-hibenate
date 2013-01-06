package com.maneeshsri.sample.action;

import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.maneeshsri.sample.model.Job;
import com.maneeshsri.sample.service.JobService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author maneeshkumar
 *
 */

public class SearchJobAction extends ActionSupport 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private Log logger = LogFactory.getLog(this.getClass());
	private JobService jobService ;
	private Job job;
	private List<Job> jobs;


   
    /**
     * 
     * @return
     */
    public String save()
    {
    	logger.debug("");
    	return SUCCESS;
    }

    /**
     * 
     * @return
     */
    public String delete()
    {
    	
    	
        return SUCCESS;
    }

    /**
     * 
     * @return
     */
    public String list()
    {
        return SUCCESS;
    }

    @Override
    public String input()
    {
    	
        return INPUT;
    }

	public JobService getJobService() {
		return jobService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	public Job getJob() {
		return job;
	}

	public void setUser(Job job) {
		this.job = job;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

 
}
