package com.masai.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	static private  EntityManagerFactory emf ;
	static {
		emf = Persistence.createEntityManagerFactory("EmployeeUnit");
	}
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
	
}
