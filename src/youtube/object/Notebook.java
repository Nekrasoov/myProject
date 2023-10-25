package youtube.object;

public class Notebook extends Computer {

    public Notebook() {
        super();
    }

    @Override
    public void on (){
        print("Ноутбук: Я включился. Моя модель:" +getName());
    }

    public void  charge() {
        System.out.println("Ноутбук: зарядка");
    }


}
