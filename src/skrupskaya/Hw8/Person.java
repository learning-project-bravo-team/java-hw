package skrupskaya.Hw8;

public class Person {
    private String name;
    private int age;
    private boolean gender;//false means male, true means female

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
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
