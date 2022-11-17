package histoire;

import pokemons.*;
import typePokemons.*;

public class MonHistoirePokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Test pokemon 0 ");
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("Chovsourir");
		
		p1.log(p1.toString());
		p2.log(p2.toString());
		
		p1.attaquer(p2);
		p2.log(p2.toString());*/
		
		/*--------------------------------*/
		PokemonFeu feu = new PokemonFeu("PokéFeu") ;
		PokemonEau eau =  new PokemonEau("PokéEau") ; 
		
		eau.log(eau.toString());
		feu.log(feu.toString());
		eau.attaquer(feu);
		feu.attaquer(eau);
		
		eau.log(eau.toString());
		feu.log(feu.toString());
	}

}
