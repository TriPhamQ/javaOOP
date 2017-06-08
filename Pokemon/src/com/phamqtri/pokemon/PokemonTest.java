package com.phamqtri.pokemon;

public class PokemonTest {
  public static void main(String[] args) {
    Pokedex pokedex = new Pokedex();

    Pokemon pikachu = pokedex.createPokemon("Pikachu", "Electric", 100);
    Pokemon bulbasaur = pokedex.createPokemon("Bulbasaur", "Grass", 120);
    
    pokedex.attackPokemon(bulbasaur);
    System.out.println(pikachu.getName());
    System.out.println(pikachu.getHealth());
    System.out.println(bulbasaur.getName());
    System.out.println(bulbasaur.getHealth());
    pokedex.pokemonInfo();
  }  
}
