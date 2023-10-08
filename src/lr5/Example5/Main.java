package lr5.Example5;

public class Main {
    private int number;

    public Main() {
    }

    public Main(int number) {
        if (this.number > 100) {
            this.number = 100;
        } else if (this.number < 100) {
            this.number = number;
        } else {
            this.number = 0;
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public void print () {
        if (number > 100) {
            number = 100;
        } else if (number < 100) {
            number = number;
        } else {
            number = 0;
        }
        System.out.println(number);
    }

    public int getNumber() {
        return number;
    }
    public void proverka () {
        System.out.println("Исходное значение: " +number +" что-то не получается");
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