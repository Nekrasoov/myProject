package lr5.Example5;

public class Example5 {
    public static void main(String[] args) {
        Main main = new Main();
        main.setNumber(121);

        main.print();
        main.proverka();

        Main main1 = new Main(101);
        main1.print();
        main1.proverka();

    }
}

//    Напишите программу с классом, у которого есть закрытое целочисленноеполе.
//    Значение полю присваивается с помощью открытого метода. Методу
//        аргументом может передаваться целое число, а также метод может вызываться
//        без аргументов. Если методы вызывается без аргументов, то поле получает
//        нулевое значение. Если метод вызывается с целочисленным аргументом, то
//        это значение присваивается полю. Однако если переданное аргументом
//        методу значение превышает 100, то значением полю присваивается число 100.
//        Предусмотрите в классе конструктор, который работает по тому же принципу
//        что и метод для присваивания значения полю. Также в классе должен быть
//        метод, позволяющий проверить значение поля.