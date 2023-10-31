import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit(100, "Jack");
        Mage mage = new Mage(55, "Magician", 77);
        unit.printInfo();
        System.out.println();
        mage.printInfo();
    }
}
//у класса нет полей, а у объекта они есть
//Инкапсуляция - это защищённые поля и методы для работы с ними
//Наследование - это для увеличения количества данных мы используем уже созданные классы
//Полиморфизм - это использование одних классов для определения других
//public, protected, private, default