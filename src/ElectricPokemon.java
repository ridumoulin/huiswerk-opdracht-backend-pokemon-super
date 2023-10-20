package src;

public class ElectricPokemon extends Pokemons {
    private String accuracy;
    private String food;

    public ElectricPokemon(int attack, int hp, String accuracy, String food) {
        super(attack, hp);
        this.accuracy = accuracy;
        this.food= food;
    }

    @Override
    void eats() {
        System.out.println("Eating batteries");
    }

    void thunder() {
        System.out.println("Making it thunder");
    }

    void electroBall() {
        System.out.println("Throwing electro balls");
    }

    // Getter for accuracy
    public String getAccuracy() {
        return accuracy;
    }

    // Setter for accuracy
    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    // Getter for food
    public String getFood() {
        return food;
    }

    // Setter for food
    public void setFood(String food) {
        this.food = food;
    }
}
