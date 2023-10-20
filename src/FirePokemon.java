package src;

public class FirePokemon extends Pokemons {
    private int level;
    private int xp;

    public FirePokemon(String attack, int hp, int level, int xp) {
        super(attack, hp);
        this.level = level;
        this.xp= xp;
    }

    @Override
    void eats() {
        System.out.println("Eating wood");
    }

    void fireLash() {
        System.out.println("Spitting fire");
    }

    void flameThrower() {
        System.out.println("Throwing fire");
    }

    // Getter for level
    public int getLevel() {
        return level;
    }

    // Setter for level
    public void setLevel(int level) {
        this.level = level;
    }

    // Getter for xp
    public int getXp() {
        return xp;
    }

    // Setter for xp
    public void setXp(int xp) {
        this.xp = xp;
    }

}
