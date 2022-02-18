package com.example.demo.repo;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Customer;
@Repository
@EnableTransactionManagement
public class CustomerRepositoryImpl implements CustomerRepository {

	private final SessionFactory sessionFactory;
	@Autowired
	public CustomerRepositoryImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		TypedQuery<Customer> query=session.createQuery("FROM Customer C",Customer.class);
		return query.getResultList();
	}

}
