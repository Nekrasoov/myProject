package lr5.Example1;

public class Example1 {

    public static void main(String[] args) {
        Main main = new Main();

        main.setCh1('k');

        System.out.println("getCodeSymbol " + main.getCodeSymbol());

        main.showCodeAndValue();

    }

}

//1. Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.