package ilya.ilya.HW8;

public class Person {

    String name, gender;
    int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        if ("male".equals(gender)) {
            return "Mr. " + name;
        } else if ("female".equals(gender)) {
            return "Ms. " + name;
        } else return name;
    }
}

