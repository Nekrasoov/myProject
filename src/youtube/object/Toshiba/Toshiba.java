package youtube.object.Toshiba;

import youtube.object.Computer;

public abstract class Toshiba extends Computer {
    public String shortName="IBM";
    public abstract void openCD();

    public abstract void closeCD();

    public void printMyModel () {
        System.out.println("My model is...");
    }

}
