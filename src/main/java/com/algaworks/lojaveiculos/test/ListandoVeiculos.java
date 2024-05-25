package com.algaworks.lojaveiculos.test;

import java.util.List;

import javax.persistence.EntityManager;

import com.algaworks.lojaveiculos.dominio.Veiculo;
import com.algaworks.lojaveiculos.utils.JpaUtil;
import javax.persistence.Query;

public class ListandoVeiculos {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		Query query = manager
				.createQuery("select v from Veiculo v");
		
		List<Veiculo> veiculos = query.getResultList();
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getCodigo() + " - "
					+ veiculo.getFabricante() + " "
					+ veiculo.getModelo() + ", ano "
					+ veiculo.getAnoFabricacao() + "/"
					+ veiculo.getAnoModelo() + " por "
					+ "R$" + veiculo.getValor());
		}
		
		manager.close();
		JpaUtil.close();
	}
	
}
