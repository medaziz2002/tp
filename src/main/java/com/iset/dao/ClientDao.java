package com.iset.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iset.entities.Client;
import com.iset.util.JPAUtil;
import com.iset.util.JPAUtil.JPAutil;

public class ClientDao {

	private EntityManager entityManager=JPAutil.getEntityManager("MonProjetJPA");


  public void ajouter(Client c)
  {
	  EntityTransaction tx=entityManager.getTransaction();
	  tx.begin();
	  //dans hibernate save=>dans jpa persist
	  entityManager.persist(c);
	  tx.commit();
	    
  }
  
  public void modifier(Client c)
  {
	 EntityTransaction tx=entityManager.getTransaction();
	 tx.begin();
	 //merge =>update
	 entityManager.merge(c);
	  tx.commit();
  }


  public void supprimer(Client c)
  {
	
	  EntityTransaction tx=entityManager.getTransaction();
	  tx.begin();
	  c=entityManager.merge(c);
	  entityManager.remove(c);
	  tx.commit();
  }
  
  
  public List<Client> listerTous()
  {
	  
	  List<Client> clients=entityManager.createQuery("select c from Client c ")
			  .getResultList();
	  return clients;
  }


  public List<Client> listerParNom(String nom)
  {
	  
	List<Client> clients=entityManager.createQuery("select c from Client c where c.nom like :pnom")  
	 .setParameter("pnom","%"+nom+"%").getResultList();
	return clients;
  }


	
}
