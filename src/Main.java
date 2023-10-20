package src;

public class Main {
        public static void main(String[] args) {
            FirePokemon fp1 = new FirePokemon(6, 8, 3, 5);
            fp1.eats();
            fp1.speaks();
            fp1.fireLash();
            fp1.flameThrower();

            WaterPokemon wp1 = new WaterPokemon(10, 6, 150, 7);
            wp1.eats();
            wp1.speaks();
            wp1.hydroCanon();
            wp1.surf();

            GrassPokemon gp1 = new GrassPokemon(3, 2, "insects", "Miep");
            gp1.eats();
            gp1.speaks();
            gp1.leaveBlade();
            gp1.leafStorm();

            ElectricPokemon ep1 = new ElectricPokemon(4, 5, "good", "batteries");
            ep1.eats();
            ep1.speaks();
            ep1.thunder();
            ep1.electroBall();
        }
}
