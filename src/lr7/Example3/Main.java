package lr7.Example3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(6);
        System.out.println(superClass.toString());
        SubClass1 SubClass1 = new SubClass1('a', 3);
        System.out.println(SubClass1.toString());
        SubClass2 SubClass2 = new SubClass2('b', 4, "c");
        System.out.println(SubClass2.toString());
    }
}