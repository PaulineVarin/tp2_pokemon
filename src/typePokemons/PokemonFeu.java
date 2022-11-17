package typePokemons;
import pokemons.Pokemon;

public class PokemonFeu extends Pokemon {
	//Attributs
	
	//Constructeur
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU); 
	}

	@Override
	public void attaquer(Pokemon p) {
		log("J'attaque "+p.getNom()); 
		
		switch(p.getType()) {
			case EAU : {
				log ("FEU VS EAU") ;
				break ; 
			}
			case PLANTE : {
				log ("FEU VS PLANTE") ; 
				break ; 
			}
			
			case FEU : {
				log ("FEU VS FEU") ;
				break ; 
			}
			
			default : {
				log("FEU VS Inconnu") ;
				break ; 
			}
		}
		
		p.subir(this);
		
	}

	@Override
	public void subir(Pokemon p) {
		
		switch(p.getType()){
			case EAU : {
				log("C'est très efficace"); 
				this.hp = this.getHp() - (2*p.getAtk()) ; 
				break ; 
			}
			case PLANTE : {
				log("C'est très peu  efficace"); 
				this.hp = (int) (this.getHp() - (0.5*p.getAtk())) ; 
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
