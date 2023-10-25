package lr7.Example5;

public class SubClass1 extends SuperClass {
    final int num;
    public SubClass1(String str, int num) {
        super(str);
        this.num = num;
    }

    int getInt(){
        return num;
    }

    public String toString() {
        String Field;
        Field = this.getClass().getSimpleName() +
                "\n" + getStr() + "\n" + getInt();
        System.out.println(Field);
        return super.toString() + Field;
    }
}
