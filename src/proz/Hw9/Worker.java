package proz.Hw9;

public class Worker extends Employee{

    @Override
    public double getSalary(){
        return getBaseSalary();
    }
}

//Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
