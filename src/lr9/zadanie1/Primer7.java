package lr9.zadanie1;

public class Primer7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
//            throw new ArithmeticException(); Exception in thread "main" java.lang.ArithmeticException
//	at lr9.zadanie1.Primer7.main(Primer7.java:10)
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }

}
