package proz.Hw8.t1;

import static proz.Hw8.t1.Kata.declareWinner;

class Main {
    public static void main(String[] args) {
        codeWars81 cw = new codeWars81();
        cw.setSide(99);
        System.out.println(cw.getSide());
        Block b = new Block(new int[] {2,3,4});
        System.out.println(b.getHeight());
        System.out.println(b.getLength());
        System.out.println(b.getWidth());
        System.out.println(b.getSurfaceArea());
        System.out.println(b.getVolume());
        System.out.println("--------------");
        Fighter fighter1= new Fighter("F1",100,30);
        Fighter fighter2 = new Fighter("F2", 100,31);
        System.out.println(declareWinner(fighter1,fighter2,fighter2.name));
    }
}
