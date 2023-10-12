package lr6.Example2;

public class Example2 {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        myClass.callMethod();
        myClass.callMethod();

    }

}

//Напишите программу с классом, в котором есть закрытое статическое
//целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.