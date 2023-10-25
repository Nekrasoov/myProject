package lr7.Example4;

public
class SuperClass {
    char ch;

    SuperClass(char ch) {
        setCh(ch);
    }

    public SuperClass() {
    }

    void setCh(char ch) {
        this.ch = ch;
    }

    char getCh() {
        return ch;
    }

    @Override
    public String toString() {
        String NameField;
        NameField =
                "Класс: " + this.getClass().getSimpleName()
                        + "\n" + "Символ: " + this.getCh();
        return NameField;
    }
}
