package src;

public class GrassPokemon extends Pokemons {
    private String food;
    private String sound;

    public GrassPokemon(String attack, int hp, String food, String sound) {
        super(attack, hp);
        this.food = food;
        this.sound= sound;
    }

    @Override
    void eats() {
        System.out.println("Eating insects");
    }

    void leaveBlade() {
        System.out.println("Fighting with blade");
    }

    void leafStorm() {
        System.out.println("Making a leaf tornado");
    }

    // Getter for food
    public String getFood() {
        return food;
    }

    // Setter for food
    public void setFood(String food) {
        this.food = food;
    }

    // Getter for sound
    public String getSound() {
        return sound;
    }

    // Setter for sound
    public void setSound(String sound) {
        this.sound = sound;
    }
}
