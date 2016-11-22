package com.voidking.hibernate_spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.voidking.hibernate_spring.dao.DlDao;
import com.voidking.hibernate_spring.model.Dlb;

public class Test {
	public static void main(String[] args) {
		Dlb dlb = new Dlb();
		dlb.setXh("081109");
		dlb.setKl("123456");
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		DlDao dlDao = (DlDao)context.getBean("dlDao");
		dlDao.save(dlb);
		
	}
}
