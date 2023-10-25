package lr7.Example5;

public class SuperClass {
    final String str;

    public SuperClass(String str){
        this.str = str;
    }

    String getStr (){
        return str;
    }

    public String toString() {
        String Field;
        Field =  this.getClass().getSimpleName() +
                "\n" + this.getStr();
        System.out.println(Field);
        return super.toString() + Field;
    }
}
