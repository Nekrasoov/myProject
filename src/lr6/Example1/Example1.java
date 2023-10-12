package lr6.Example1;

public class Example1 {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.setCh1OrStr1('l');
        myClass.setCh1OrStr1("Привет");

        System.out.println(myClass.ch1);
        System.out.println(myClass.str1);

        char[] chars1 = new char[5];
        chars1[0] = 'П';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';

        myClass.setCh1OrStr1(chars1);
        System.out.println(myClass.str1);

        char[] chars2 = new char[1];
        chars2[0] = 'Ц';


        myClass.setCh1OrStr1(chars2);
        System.out.println(myClass.ch1);
    }






}

//. Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//В классе должен быть перегруженный метод для присваивания значений полям. Если метод
//вызывается с символьным аргументом, то соответствующее значение присваивается
//символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//значение текстового ноля. Методу аргументом также может передаваться символьный
//массив. Если массив состоит из одного элемента, то он определяет значение символьного
//поля. В противном случае (если в массиве больше одного элемента) из символов массива
//формируется текстовая строка и присваивается значением текстовому полю.