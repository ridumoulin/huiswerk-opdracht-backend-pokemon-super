package src;

public class WaterPokemon extends Pokemons {
    private int height;
    private int level;

    public WaterPokemon(String attack, int hp, int height, int level) {
        super(attack, hp);
        this.height = height;
        this.level = level;
    }

    @Override
    void eats() {
        System.out.println("Eating fish");
    }

    void hydroCanon() {
        System.out.println("Shooting water boms");
    }

    void surf() {
        System.out.println("Surfing");
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter for level
    public int getXp() {
        return level;
    }

    // Setter for level
    public void setLevel(int level) {
        this.level = level;
    }
}
