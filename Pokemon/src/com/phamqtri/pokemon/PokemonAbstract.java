package com.phamqtri.pokemon;

public abstract class PokemonAbstract implements PokemonInterface {
  public Pokemon createPokemon(String name, String type, int health) {
    Pokemon pokemon = new Pokemon(name, type, health);
    return pokemon;
  }

  public void attackPokemon(Pokemon pokemon) {
    System.out.println("Pokemon attacks!");
    pokemon.setHealth(pokemon.getHealth() - 10);
  }
}
