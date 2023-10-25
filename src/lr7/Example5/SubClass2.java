package lr7.Example5;

public
class SubClass2 extends SuperClass{
    final char ch;


    public SubClass2(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    char getChar (){
        return ch;
    }

    public String toString() {
        String Field;
        Field =
                this.getClass().getSimpleName() + "\n" + this.getStr() +
                        "\n" + getChar();
        System.out.println(Field);
        return super.toString() + Field;
    }
}
