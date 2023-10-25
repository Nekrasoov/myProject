package lr7.Example3;

public class SuperClass {
    int num;

    SuperClass(int num) {
        setValue(num);
    }

    public SuperClass() {
    }

    void setValue(int num) {
        this.num = num;
    }

    int getInt() {
        return num;
    }

    @Override
    public String toString() {
        String NameFieldValue;
        NameFieldValue =
                "Класс: " + this.getClass().getSimpleName()
                        + "\n" + this.getInt();
        return NameFieldValue;
    }
}