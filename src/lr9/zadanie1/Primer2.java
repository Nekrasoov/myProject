package lr9.zadanie1;

public class Primer2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
//            System.out.println("1");  java: unreachable statement
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }

}
