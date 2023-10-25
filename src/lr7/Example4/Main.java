package lr7.Example4;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass('X');
        System.out.println(superClass.toString());
        SubClass1 subClass1 = new SubClass1('о',"строчка");
        System.out.println(subClass1 .toString());
        SubClass2 subClass2 = new SubClass2('ч',"строчка2",4);
        System.out.println(subClass2 .toString());
    }
}