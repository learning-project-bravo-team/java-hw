package skrupskaya.Hw8;

public class Person {
    private String name;
    private int age;
    private boolean gender;//false means male, true means female

    public Person(String name, int age, boolean gender) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Incorrect age");
        }
        this.gender = gender;
    }

    public String getName() {
        if (!gender) {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }
}
