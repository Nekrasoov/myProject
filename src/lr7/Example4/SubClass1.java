package lr7.Example4;

public class SubClass1 extends SuperClass{
    public String str;

    public void setChar1Str1(char ch, String str) {
        super.ch = ch;
        this.str = str;
    }

    SubClass1(char ch, String str) {
        super(ch);
        this.setChar1Str1(ch, str);
    }

    SubClass1(SubClass1 copy) {
        super(copy.ch);
        this.setChar1Str1(copy.ch, copy.str);
    }

    String getStr() {
        return str;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n" +  "Имя класса: " + this.getClass().getSimpleName()
                        + "\n" +
                        "Строка = " + this.getStr();
        return super.toString() + ClassNameAndFieldValue;
    }
}
