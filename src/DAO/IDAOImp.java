package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Metier.Entity.Produits;

	
	
public class IDAOImp implements IDAO{

	private static  EntityManager entity;

	
	
	@Override
	public double getValue() {
		double data=10;
		return data;
	}

	@Override
	public List<Produits> afficherProduits() {
		
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("ismail");
		
		entity=fact.createEntityManager();
		
		EntityTransaction trans =entity.getTransaction();
		trans.begin();
		
		try {
			
			List<Produits> arr = entity.createQuery("FROM Produits").getResultList();
			
			trans.commit();
			
			return arr;
			
		}catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
		
		return null;
	}

}
