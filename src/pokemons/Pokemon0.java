package pokemons;

import java.util.Random;

public class Pokemon0 {
	//Attributs
	private String nom; 
	private int niveau ; 
	private int hp ; 
	private int atk ; 
	private static Random random = new Random() ; //le static permet de faire en sorte que l'attribut soit partagé par toutes les instances de la classe
	private static final int NIVEAU_MAX = 10 ; 
	
	
	// Constructeur 
	public Pokemon0 (String nom) {
		this.nom = nom ; 
		this.niveau = random.nextInt(1,NIVEAU_MAX+1); 
		this.hp = 2 * this.niveau ; 
		this.atk = (this.niveau / 2 ) + 1 ; 
	}
	
	//Méthodes 	
	private String prefixe() {
		return "[Pokemon "+this.nom+"] : "; 
	}
	
	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public boolean isKo () {
		return this.hp==0 ; 
	}
	
	public void soigner() {
		this.hp = 2*this.niveau ; 
	}
	
	public void attaquer (Pokemon0 p) {
		log("J'attaque " + p.nom);
		p.hp -= this.atk ; 
		
	}
	
	public String toString() {
		return "Je m'apelle "
				+this.nom + "\n"+ " je suis au niveau "
				+ this.niveau + " j'ai  "
				+this.hp+ " points de vie " + " mon attaque de base est de "
				+this.atk; 
	}
	
	public void log(String msg) {
		System.out.println(prefixe()+msg);
	}
}