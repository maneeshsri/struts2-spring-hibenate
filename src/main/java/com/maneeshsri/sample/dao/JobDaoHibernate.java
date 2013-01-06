package com.maneeshsri.sample.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
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

		return getHibernateTemplate().find("from Job");

	}

	@Transactional
	public Job findById(Long id) {

		return (Job) getHibernateTemplate().get(Job.class, id);

	}

	@Transactional
	public void update(Job job) {

		getHibernateTemplate().saveOrUpdate(job);

	}

	@Transactional
	public int deleteAll() {

		String hql = "delete job";

		Query query = getSession().createQuery(hql);

		int rowCount = query.executeUpdate();

		return rowCount;

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Job> findByStateAndFunction(String state, String function) {
		Job job = new Job();

		job.setState(state);
		job.setFunction(function);

		Example example = Example.create(job);

		Criteria criteria = getSession().createCriteria(Job.class);

		criteria.add(example);

		return criteria.list();

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<String> getAllStates() {
		Query query = getSession().getNamedQuery("job.findAllStates");
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<String> getAllJobFunctions() {
		Query query = getSession().getNamedQuery("job.findAllFunctions");
		return query.list();
	}

}
