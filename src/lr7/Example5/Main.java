package lr7.Example5;

public class Main {
    public static void main(String[] args) {
        SuperClass SuperClass = new SuperClass("Супер класс");
        SuperClass.toString();
        SubClass1 SubClass1 = new SubClass1("Первый подкласс", 1);
        SubClass1.toString();
        SubClass2 subClass2 = new SubClass2("Второй подкласс", 'В');
        subClass2.toString();
    }
}
