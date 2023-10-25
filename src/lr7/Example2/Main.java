package lr7.Example2;

public class Main {
    public static void main(String[] args) {
        SuperClass sClass = new SuperClass();
        sClass.toString();
        SuperClass sClass1 = new SuperClass("Текст супер класса ");
        sClass1.toString();
        SubClass subClass1 = new SubClass();
        subClass1.toString();
        SubClass subClass2 = new SubClass("Текст подкласса 1 ");
        subClass2.toString();
        SubClass subClass3 = new SubClass(1);
        subClass3.toString();
        SubClass subClass4 = new SubClass("Текст подкласса 2", 1);
        subClass4.toString();
    }
}