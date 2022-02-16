package org.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.example.entity.Customer;

import javax.persistence.Query;


@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory

	private final SessionFactory sessionFactory;

	@Autowired
	public CustomerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.openSession();
				
		// create a query
		Query query=currentSession.createQuery("FROM Customer ");
		// execute query and get result list
		List<Customer> customers = query.getResultList();
				
		// return the results		
		return customers;
	}

}






