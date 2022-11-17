package typePokemons;
import pokemons.Pokemon;

public class PokemonPlante extends Pokemon {
	//Attributs
	
	//Constructeur
	public PokemonPlante(String nom) {
		super(nom, TypePokemon.PLANTE); 
	}

	@Override
	public void attaquer(Pokemon p) {
log("J'attaque "+p.getNom()); 
		
		switch(p.getType()) {
			case EAU : {
				log ("PLANTE VS EAU") ;
				break ; 
			}
			case PLANTE : {
				log ("PLANTE VS PLANTE") ; 
				break ; 
			}
			
			case FEU : {
				log ("PLANTE VS FEU") ;
				break ; 
			}
			
			default : {
				log("PLANTE VS Inconnu") ;
				break ; 
			}
		}
		
		p.subir(this);
	}

	@Override
	public void subir(Pokemon p) {
		
		switch(p.getType()){
			case EAU : {
				log("C'est très peu efficace"); 
				this.hp = (int) (this.getHp() - (0.5*p.getAtk())) ; 
				break ; 
			}
			case PLANTE : {
				log("C'est très peu  efficace"); 
				this.hp = (int) (this.getHp() - (0.5*p.getAtk())) ; 
				break ; 
			}
			case FEU : {
				log("C'est très efficace"); 
				this.hp = this.getHp() - (2*p.getAtk()) ;
				break ; 
			}
			default : {
				this.hp = this.getHp() - (1*p.getAtk()) ; 
				break ; 
			}
		}
		
	}
	

}
