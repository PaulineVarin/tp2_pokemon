package typePokemons;

public enum TypePokemon {
	FEU("Feu"), 
	EAU("Eau"),
	PLANTE("Plante");
	String type ; 
	
	private TypePokemon(String type) {
		this.type = type ; 
		
	}
	
	public String toString() {
		return this.type ; 
	}
	

}
