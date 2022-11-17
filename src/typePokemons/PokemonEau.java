package typePokemons;
import pokemons.Pokemon;

public class PokemonEau extends Pokemon {
	//Attributs
	
	//Constructeur
	public PokemonEau(String nom) {
		super(nom, TypePokemon.EAU); 
	}

	@Override
	public void attaquer(Pokemon p) {
		log("J'attaque "+p.getNom()); 
		
		switch(p.getType()) {
			case EAU : {
				log ("EAU VS EAU") ;
				break ; 
			}
			case PLANTE : {
				log ("EAU VS PLANTE") ; 
				break ; 
			}
			
			case FEU : {
				log ("EAU VS FEU") ;
				break ; 
			}
			
			default : {
				log("EAU VS Inconnu") ;
				break ; 
			}
		}
		
		p.subir(this);
		
	}

	@Override
	public void subir(Pokemon p) {
		
		switch(p.getType()){
			case EAU : {
				log("C'est très peu  efficace"); 
				this.hp = (int) (this.getHp() - (0.5*p.getAtk())) ; 
				break ; 
			}
			case PLANTE : {
				log("C'est très efficace"); 
				this.hp = this.getHp() - (2*p.getAtk()) ;
				break ; 
			}
			case FEU : {
				log("C'est très peu efficace"); 
				this.hp = (int) (this.getHp() - (0.5*p.getAtk())) ; 
				break ; 
			}
			default : {
				this.hp = this.getHp() - (1*p.getAtk()) ; 
				break ; 
			}
		}
		
	}
	

}
