package youtube.main;


import youtube.object.Computer;
import youtube.object.Notebook;
import youtube.object.Toshiba.Toshiba;
import youtube.object.Toshiba.ToshibaModel1;

public class MyFirstProgram {
    public static void main(String[] args) {

//        Computer comp = new Computer("IBA",-12048,1350,13500);
//
//
//        comp.setName("IBM");
//        comp.setRam(2048);
//        comp.setHdd(350);
//
//        comp.on();
//        comp.load();
//        comp.off();
//
//        Computer notebook = new Notebook();
//        notebook.setName("UBM");
//        doSmth(notebook);
////        notebook.on();
//
//        Computer comp = new Computer("IBM");
//        doSmth(comp);
//    }

//        Toshiba toshiba = new ToshibaModel1();
//        toshiba.openCD();
//        toshiba.closeCD();
//
//
//        Computer comp = null;
//        comp.print("test string");
//        comp = new Computer();
//        comp.writeCD();


        Notebook note = new Notebook();
        note.reboot();



    }

    public static void doSmth(Computer comp) {
        if (comp instanceof Notebook) {
            ((Notebook) comp).on();
            ((Notebook) comp).charge();
        } else if (comp instanceof Computer) {
            comp.on();
        }

    }
}
