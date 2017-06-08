package com.phamqtri.pokemon;

public interface PokemonInterface {
  Pokemon createPokemon(String name, String type, int health);
  void attackPokemon(Pokemon pokemon);
  default void pokemonInfo() {
    System.out.println("Getting pokemon information");
  }
}
