package proz.Hw9;

public class Director extends Manager{

    @Override

    public double getSalary(){

        if (getNumberOfSubordinates()==0){
            return getBaseSalary();
        } else{
            return getBaseSalary() + getBaseSalary() *((double)getNumberOfSubordinates()/100*9);
        }
    }
}

//Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат
// по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
