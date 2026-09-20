import skrupskaya.Hw6.HW61;
import skrupskaya.Hw6.SKrupHW63;
import skrupskaya.Hw7.SKrupHW7;
import skrupskaya.Hw8.Block;
import skrupskaya.Hw8.Fighter;

static void main(){
    System.out.println("Test");

    HW61.summ();//print the summa of multi array
    HW61.max();//print the max number from the array
    HW61.countElements();//print the N of elements in the array
    SKrupHW63.leftPyramid();
    System.out.println("______________________");
    SKrupHW63.rightPyramid();
    System.out.println("______________________");
    SKrupHW63.fullPyramid();

    Block a = new Block(new int[] {2, 4, 6});
    System.out.println(a.getWidth());
    System.out.println(a.getLength());
    System.out.println(a.getHeight());
    System.out.println(a.getVolume());
    System.out.println(a.getSurfaceArea());

    Fighter lew = new Fighter("Lew", 10, 2);
    Fighter harry = new Fighter("Harry", 5, 4);
    System.out.println(Fighter.returnTheWinnerName(lew, harry));


    System.out.println("summ is: ");
    System.out.println(SKrupHW7.summ(5, 8));//summ
    System.out.println("substraction: ");
    System.out.println(SKrupHW7.substract(2, 7));//substract
    System.out.println("multiplication: ");
    SKrupHW7.multiply(6, 0);//mult
    System.out.println("division: ");
    System.out.println(SKrupHW7.divide(5, 3));//divide
    System.out.println("int * 2: ");
    System.out.println(SKrupHW7.doubleInteger(45));

    System.out.println(SKrupHW7.isLove(12, 24));//false
    System.out.println(SKrupHW7.isLove(25, 37));//false
    System.out.println(SKrupHW7.isLove(24, 29));//true
    System.out.println(SKrupHW7.isLove(29, 24));//true
    System.out.println("String: ");
    System.out.println(SKrupHW7.numberToString(123));
    System.out.println("the min is: ");
    System.out.println(SKrupHW7.findSmallestInt(new int[]{34, 15, 88, 2}));
    System.out.println("String: ");
    System.out.println(SKrupHW7.countingSheep(3));
}
