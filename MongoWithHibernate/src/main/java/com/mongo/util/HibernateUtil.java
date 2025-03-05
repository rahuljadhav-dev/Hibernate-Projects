package com.mongo.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY;
	static {
		try {
			ENTITY_MANAGER_FACTORY=Persistence.createEntityManagerFactory("ogm-mongodb");
		} catch (Throwable ex) {
			System.err.println("Initial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static EntityManager getEntityManager() {
		return ENTITY_MANAGER_FACTORY.createEntityManager();
	}

}
