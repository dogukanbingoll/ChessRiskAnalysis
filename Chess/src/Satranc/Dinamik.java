package Satranc;

import Satranc.Taslar.*;

import java.util.ArrayList;

//Oyun içerisinde kullanılacak olan dinamikler buradan çekilmektedir
public class Dinamik {

    //Siyah ve beyaz puanların toplanamsı için kullanılacaktır
    public static ArrayList<Double> toplam(double a, double b){
        ArrayList<Double> toplam=new ArrayList<Double>();
        toplam.add(a);
        toplam.add(b);
        return toplam;
    }

    //Seçilen taşın beyaz olması durumunda diğer taşlarla kıyaslanması için kullanılacak fonksiyondur.
    public static double hamleBeyaz(ArrayList<ArrayList<Obje>> objeler,Obje obje2,double siyahPuan){
        siyahPuan=0;
        if (obje2.getClass().getName().equals(Piyon.class.getName()) && obje2.getColor().equals("siyah")) {
            siyahPuan = siyahPuan- 0.5;
            obje2.setCurrency(0);


            return siyahPuan;


        }
        else if (obje2.getClass().equals(At.class) && obje2.getColor().equals("siyah")) {
            siyahPuan = siyahPuan - 1.5;
            obje2.setCurrency(0);
            return siyahPuan;
        }
        else if (obje2.getClass().equals(Kale.class) && obje2.getColor().equals("siyah")) {
            siyahPuan = siyahPuan - 2.5;
            obje2.setCurrency(0);
            return siyahPuan;
        }
        else if (obje2.getClass().equals(Fil.class) && obje2.getColor().equals("siyah")) {
            siyahPuan = siyahPuan - 1.5;
            obje2.setCurrency(0);
            return siyahPuan;
        }
        else if (obje2.getClass().equals(Vezir.class) && obje2.getColor().equals("siyah")) {
            siyahPuan = siyahPuan - 4.5;
            obje2.setCurrency(0);
            return siyahPuan;
        }
        else if (obje2.getClass().equals(Sah.class) && obje2.getColor().equals("siyah")) {
            siyahPuan = siyahPuan - 50;
            obje2.setCurrency(0);
            return siyahPuan;
        }
        else{
            siyahPuan=siyahPuan;
        }
        return siyahPuan;
    }

    //Seçilen taşın siyah olması durumunda diğer taşlarla kıyaslanması için kullanılacak fonksiyondur.

    public static double hamleSiyah(ArrayList<ArrayList<Obje>> objeler,Obje obje2,double beyazPuan){

        beyazPuan=0;
        if (obje2.getClass().equals(Piyon.class) && obje2.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan - 0.5;
            obje2.setCurrency(0);
            return beyazPuan;
        }
        else if (obje2.getClass().equals(At.class) && obje2.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan - 1.5;
            obje2.setCurrency(0);
            return beyazPuan;
        }
        else  if (obje2.getClass().equals(Kale.class) && obje2.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan - 2.5;
            obje2.setCurrency(0);
            return beyazPuan;
        }
        else  if (obje2.getClass().equals(Fil.class) && obje2.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan - 1.5;
            obje2.setCurrency(0);
            return beyazPuan;
        }
        else if (obje2.getClass().equals(Vezir.class) && obje2.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan - 4.5;
            obje2.setCurrency(0);
            return beyazPuan;
        }
        else if (obje2.getClass().equals(Sah.class) && obje2.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan - 50;
            obje2.setCurrency(0);
            return beyazPuan;
        }
        else{
            beyazPuan=beyazPuan;
        }
        return beyazPuan;
    }

}
