static void main(){
    System.out.println("Test");

    HW61.summ();//print the summa of multi array
    HW61.max();//print the max number from the array
    HW61.countElements();//print the N of elements in the array

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
