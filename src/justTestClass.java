static void main(){
    System.out.println("Test");

    HW61.summ();//print the summa of multi array
    HW61.max();//print the max number from the array
    HW61.countElements();//print the N of elements in the array

    Block a = new Block(new int[] {2, 4, 6});
    System.out.println(a.getWidth());
    System.out.println(a.getLength());
    System.out.println(a.getHeight());
    System.out.println(a.getVolume());
    System.out.println(a.getSurfaceArea());

    Fighter lew = new Fighter("Lew", 10, 2);
    Fighter harry = new Fighter("Harry", 5, 4);
    System.out.println(Fighter.returnTheWinnerName(lew, harry));


}
