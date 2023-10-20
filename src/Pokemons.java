package src;

import org.w3c.dom.ls.LSOutput;

public abstract class Pokemons {
    private int attack;
    private int hp;

    public Pokemons(int attack, int hp) {
        this.attack = attack;
        this.hp = hp;
    }

    abstract void eats();

    void speaks() {
        System.out.println("Speaking English");
    }

}
