package dresseursPokemons;

import java.util.ArrayList;

import pokemons.Pokemon;

public class SacADos {
	//Attributs
	private Dresseur dresseur ; 
	private ArrayList<Pokemon> pokemons ; 
	
	//Constructeur 
	public SacADos(Dresseur d) {
		this.dresseur = d ; 
		this.pokemons = new ArrayList<>() ;		
	}

}
