package lr7.Example2;

public class SuperClass {
    private String str;

    SuperClass() {
        setString();
    }

    SuperClass(String str) {
        setString(str);
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

    public String toString() {
        String superClassNameAndFieldValue = "superClas { " + "str1 = \"" + getString() + '\"' + " string.length = " + "\"" + strLength() + "\" }\n";
        System.out.println(superClassNameAndFieldValue);
        return superClassNameAndFieldValue;
    }
}
