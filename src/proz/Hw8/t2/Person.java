package proz.Hw8.t2;

public class Person {
    String name;
    int age;
    String gender;
    public Person(String name,int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName(){
        if (gender.equalsIgnoreCase("male")){
            return "Mr. " + name;
        }
        else{
            return "Mrs. " + name;
        }
    }
}
