package com.algaworks.lojaveiculos.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("AlgaWorks-PU");
		
		entityManagerFactory.close();
	}
	
}
