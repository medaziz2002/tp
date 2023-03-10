package com.iset.test;

import com.iset.dao.ClientDao;
import com.iset.entities.Client;

public class Test {
	
	public static void main(String[] args)
	{
		//cree l'objet client
		Client c=new Client();
		c.setNom("mohamed aziz belhaj hassine");
		c.setVille("Nabeul");
		//ajout l'objet a la bb
		
		ClientDao cltDao=new ClientDao();
		
		cltDao.ajouter(c);
		
		System.out.println("appel a la methode listerTous");
		
		for(Client c1:cltDao.listerTous())
		{
			
			System.out.println(c1.getCode()+" "+c1.getNom()+" "+c1.getVille());
			
		}
		
		System.out.println("Appel de la méthode listerParNom");
		
		
		for(Client c1 :cltDao.listerParNom("aziz"))
		{
			System.out.println(c1.getCode()+" "+c1.getNom()+" "+c1.getVille());
		}
		
		
		
		
		
	}
	
	

}
