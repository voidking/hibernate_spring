package com.voidking.hibernate_spring.dao.imp;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.voidking.hibernate_spring.dao.DlDao;
import com.voidking.hibernate_spring.model.Dlb;

public class DlDaoImp implements DlDao {
	// 依赖注入SessionFactory对象，set方法注入
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Dlb dl) {
		try {
			Session session = sessionFactory.openSession();
			Transaction ts = session.beginTransaction();
			session.save(dl);
			ts.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
