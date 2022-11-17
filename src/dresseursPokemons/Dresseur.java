package dresseursPokemons;

public class Dresseur {
	//Attributs
	private String nom ; 
	private int argent ; 
	private SacADos sacADos ; 
	private Pokeball pokeball ; 
	
	//Constructeur
	public Dresseur(String nom) {
		this.nom = nom ;
		this.argent = 0 ; 
		this.sacADos = new SacADos(this) ;
		this.pokeball = new Pokeball() ; 
	}
}
