package com.iset.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//erreur * @Entity en rouge
//table client cannot be resolved quisque j'ai le connexion msql est deja connecter a la bdd elle a detecter 
//il n'y a pas table client 
@Entity
public class Client implements Serializable{
	
private static final long serialVersionUID=1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int code;
private String nom;
private String ville;

public int getCode() {
return code;
}
public void setCode(int code) {
this.code = code;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getVille() {
return ville;
}
public void setVille(String ville) {
this.ville = ville;
}


}
