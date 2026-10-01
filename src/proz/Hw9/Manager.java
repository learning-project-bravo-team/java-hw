package proz.Hw9;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates=numberOfSubordinates;
    }

    @Override

    public double getSalary(){
        if (numberOfSubordinates ==0){
            return super.getSalary();
        }
        else {
            return getBaseSalary() + getBaseSalary() * ((double)numberOfSubordinates / 100 * 3);
        }
    }
}
//Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
//
// в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
// Если количество подчиненных 0, то результат как у обычного рабочего.