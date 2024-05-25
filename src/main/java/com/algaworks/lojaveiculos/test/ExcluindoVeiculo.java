package com.algaworks.lojaveiculos.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.algaworks.lojaveiculos.dominio.Veiculo;
import com.algaworks.lojaveiculos.utils.JpaUtil;

public class ExcluindoVeiculo {
	
	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		manager.remove(veiculo);
		
		tx.commit();
		manager.close();
		JpaUtil.close();
		
	}
	
}
