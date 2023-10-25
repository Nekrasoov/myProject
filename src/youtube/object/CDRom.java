package youtube.object;

public class CDRom {
    private String name;
    private double speed;
    private boolean cdWritable;

    public void writeCD () {
        System.out.println("Writing CD....");
    }
    public void openCD () {
        System.out.println("Opening CD....");
    }
    public void closeCD () {
        System.out.println("Closing CD....");
    }
    public void readCD () {
        System.out.println("Reading CD....");
    }




//G&S
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isCdWritable() {
        return cdWritable;
    }

    public void setCdWritable(boolean cdWritable) {
        this.cdWritable = cdWritable;
    }


}
