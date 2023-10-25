package youtube.object;

public class Computer {

    private String name;
    private int Ram;
    private int Hdd;
    private double weight;
    private CDRom cdRom;



    public Computer() {

    }

    public Computer(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.Ram = ram;
        this.Hdd = hdd;
        this.weight = weight;
    }


    public String getName(){
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public int getRam() {
        return Ram;
    }


    public void setRam(int ram) {
        if (ram>0){
            this.Ram = ram;
        } else {
            System.out.println("Переданное значение"+ram+"не может быть отрицательным");
        }

    }

    public int getHdd() {
        return Hdd;
    }

    public void setHdd(int hdd) {
        if (hdd>0){
            this.Hdd = hdd;
        } else {
            System.out.println("Переданное значение"+hdd+"не может быть отрицательным");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void on (){
        print("Я включился. Моя модель:" +getName());
    }

    public void off() {
        print("Я выключился");
    }

    public void load () {
        print("Я загружаюсь. Мой объем жесткого диска равен:" +getHdd()+ " ГБ");
    }


    public static void print(String str) {
        System.out.println(str);
    }

    public void writeCD(){
        if (cdRom==null)  cdRom = new CDRom();
        cdRom.writeCD();
    }


    public void reboot () {

    }

    public void reboot (boolean safeMode) {
        reboot();
    }

}
