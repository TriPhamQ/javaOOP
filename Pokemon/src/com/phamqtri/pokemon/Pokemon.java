package com.phamqtri.pokemon;

public class Pokemon {
  private String name;
  private int health;
  private String type;
  private static int pokemonCount;

  public Pokemon(String name, String type, int health) {
    this.name = name;
    this.type = type;
    this.health = health;
    pokemonCount++;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public int getHealth() {
    return this.health;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setHealth(int health) {
    this.health = health;
  }
}
