package com.maneeshsri.sample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * 
 * @author maneeshkumar
 *
 */
@Entity
@Table(name="JOB")
@NamedQueries({
	    @NamedQuery(name="job.findAllStates", query="select distinct j.state from Job j"),
        @NamedQuery(name="job.findAllFunctions", query="select distinct j.function from Job j")})
public class Job {
	
	private Long id;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	private String title;
	
	@Column(name="TITLE")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	private String function;
	
	@Column(name="FUNCTION")
	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	
	private String state;
	
	@Column(name="STATE")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	private String country;
	
	@Column(name="COUNTRY")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	private String description;
	
	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	private Date postedDate;
	
	@Column(name="POSTED_DATE")
	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}


	
	
	


	
	
		
	
	
	
	public String toString() {
		
		String tmpStr = "[ID " + id + " | FUNCTION " + function;
		
		tmpStr += " | TITLE " + title;
		
		tmpStr += " | STATE " + state;
		
		tmpStr += " | DESCRIPTION " + description;
		
		tmpStr += " | POSTED_DATE " + postedDate;

		tmpStr += " | COUNTRY " + country + "]";
		
		return tmpStr;
		
	}

}
