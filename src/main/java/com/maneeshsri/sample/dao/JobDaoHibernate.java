package com.maneeshsri.sample.dao;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.maneeshsri.sample.model.Job;


/**
 * 
 * @author maneeshkumar
 *
 */
@Repository("jobDao")
public class JobDaoHibernate extends HibernateDaoSupport implements JobDao {

	@Transactional
	public void create(Job job) {
		
		getHibernateTemplate().saveOrUpdate(job);

	}

	@Transactional
	public void delete(Job job) {

        getHibernateTemplate().delete(job);

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Job> findAll() {
		
		return getHibernateTemplate().find("from job");
		
	}

	@Transactional
	public Job findById(Long jobId) {

		return (Job) getHibernateTemplate().get(Job.class, jobId);
		
	}
	

	@Transactional
	public void update(Job job) {
		
		getHibernateTemplate().saveOrUpdate(job);

	}

	@Transactional
	public Job findByLoginName(String loginName) {
		
		Query query = getSession().getNamedQuery("job.findByLoginName");
		
		query.setString("name", loginName);
		
		Job job = (Job) query.uniqueResult();
		
		return job;	
		
	}

	@Transactional
	public int deleteAll() {
		
		String hql = "delete job";
		
		Query query = getSession().createQuery(hql);
		
		int rowCount = query.executeUpdate();
		
		return rowCount;	
		
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Job> findEmailUnverified() {
		
		Job job = new Job();
		job.setVerified(Boolean.FALSE);
		
		
		Example example = Example.create(job);
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Job.class);
		
		criteria.add(example);
		
		return getHibernateTemplate().findByCriteria(criteria);
		

		
		
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Job> findEmailUnverifiedWithDate(Calendar date) {
		
		Job job = new Job();
		
		job.setVerified(Boolean.FALSE);
		
		job.setRegistrationDate(date);
		
        Example example = Example.create(job);
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Job.class);
		
		criteria.add(example);
		
		return getHibernateTemplate().findByCriteria(criteria);
		
		
	}

	@Transactional
	public List<Job> findByStateAndJobFunction(String state, String jobFunction){		
		Job job = new Job();
		
		//job.setLoginname(loginName);
		//job.setPassword(password);
		
		Example example = Example.create(job);
		
		Criteria criteria = getSession().createCriteria(Job.class);
		
		criteria.add(example);
		
		//List<Job> u = (List) criteria.list();
		
		return null;
	
	}

	@Override
	public List<String> getAllStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllJobFunctions() {
		// TODO Auto-generated method stub
		return null;
	}

		

}
