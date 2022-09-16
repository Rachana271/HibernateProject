package com.domain;

import javax.persistence.EntityManager;



public class JPAUtil {
	static EntityManager factory;
	static EntityManager entityManager;
	
	
	public static EntityManager getEntityManager()
	{
	
	return entityManager;
}
		
}

