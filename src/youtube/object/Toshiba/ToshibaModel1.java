package youtube.object.Toshiba;

public class ToshibaModel1 extends Toshiba implements Planshet, Phone {

    @Override
    public void openCD() {
        super.printMyModel();
        System.out.println("ToshibaModel1 Overrided openCD ");
    }

    @Override
    public void closeCD() {
        System.out.println("ToshibaModel1 Overrided closeCD ");
    }

    @Override
    public void navigateByScreen() {
        System.out.println("Navigate by screen");
    }

    @Override
    public void Call() {

    }
}
