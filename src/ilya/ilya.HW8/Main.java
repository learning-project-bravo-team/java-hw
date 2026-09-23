package ilya.ilya.HW8;

public class Main {
    public static void main(String[] args) {


        /**
         * Задача №8.1.1
         *  Create a public class called Cube without a constructor which gets one single private integer variable Side,
         *  a getter GetSide() and a setter SetSide(int num) method for this property.
         *  Initialise the side to 0.
         *  */
        Cube cube = new Cube();
        cube.setSide(0);

        /**
         * Задача №8.1.2
         *  Write a class Block that creates a block (Duh..)
         *  The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height]
         *  */
        int[] array = {1, 2, 3};
        Block block = new Block(array);
        block.getVolume();
        block.getSurfaceArea();

        /**
         * Задача №8.1.3
         *  Create a function that returns the name of the winner in a fight between two fighters.
         *  Each fighter takes turns attacking the other and whoever kills the other first is victorious.
         *  Death is defined as having health <= 0.         *
         * Each fighter will be a Fighter object/instance
         *  */
        Fighter firstFighter = new Fighter("Lew", 10, 2);
        Fighter secondFighter = new Fighter("Harry", 5, 4);
        Fighter.theWinner(firstFighter, secondFighter, "Lew");
    }
}
