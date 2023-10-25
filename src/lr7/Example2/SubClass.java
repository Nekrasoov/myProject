package lr7.Example2;

public class SubClass extends SuperClass {
    private int num;
    private String str;
    SubClass() {
        setString();
    }
    SubClass(String str) {
        setString(str);
    }
    SubClass(int num) {
        setInt(num);
    }
    SubClass(String str, int num) {
        setString(str);
        setInt(num);
    }
    public void setInt(int num) {
        this.num = num;
    }
    public int getInt() {
        return num;
    }
    public void setString() {
        this.str = "Нет данных";
    }
    public void setString(String str) {
        this.str = str;
    }
    public String getString() {
        return str;
    }
    public int strLength() {
        return str.length();
    }
    public void Show() {
        System.out.println(num);
        System.out.println(str);
    }
    public String toString() {
        String ClassNameAndFieldValue = "task2Sub { " + "str2 = \"" + getString() + '\"' + " string.length = " + "\"" + strLength() + "\"}"
                + "\n \n task2Sub { " + "int1 = \"" + getInt() + "\"}";
        System.out.println(ClassNameAndFieldValue);
        return ClassNameAndFieldValue;
    }
}