package youtube;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;


    public Computer(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public int getRam() {
        return ram;
    }


    public void setRam(int ram) {
        if (ram>0){
            this.ram = ram;
        } else {
            System.out.println("Переданное значение"+ram+"не может быть отрицательным");
        }

    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        if (hdd>0){
            this.hdd = hdd;
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

    private void print(String str) {
        System.out.println(str);
    }


}
