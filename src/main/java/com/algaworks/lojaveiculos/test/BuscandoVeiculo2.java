package com.algaworks.lojaveiculos.test;

import javax.persistence.EntityManager;

import com.algaworks.lojaveiculos.dominio.Veiculo;
import com.algaworks.lojaveiculos.utils.JpaUtil;

public class BuscandoVeiculo2 {
	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		Veiculo veiculo = manager.getReference(Veiculo.class, 1L);
		System.out.println("Veículo de código " + veiculo.getCodigo()
				+ " é um " + veiculo.getModelo());
		
		manager.close();
		JpaUtil.close();
		
	}
}
