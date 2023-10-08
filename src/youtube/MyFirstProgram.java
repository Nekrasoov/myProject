package youtube;


public class MyFirstProgram {
    public static void main(String[] args) {
        Computer comp = new Computer("IBA",-12048,1350,13500);


        comp.setName("IBM");
        comp.setRam(2048);
        comp.setHdd(350);

        comp.on();
        comp.load();
        comp.off();

    }
}
