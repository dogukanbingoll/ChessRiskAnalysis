package Satranc.Taslar;


import Satranc.Dinamik;

import java.util.ArrayList;

public class At extends Obje {
    public At(String name, String color, int currency) {
        super(name, color, currency);
    }

    public ArrayList<Double> atHareket(At at,int x,int y, ArrayList<ArrayList<Obje>> objeler) {

        ArrayList<Obje> list1=objeler.get(y);
        Obje obje1=list1.get(x);
        double beyazPuan = 0;
        double siyahPuan = 0;
        ArrayList<Double> total=new ArrayList<Double>();



        if (at.getColor().equals("beyaz")) {

                beyazPuan=beyazPuan+3;

                if ((y+1)<8  && (x-2)>=0 && objeler.get(y+1).get(x-2).getColor().equals("siyah") &&objeler.get(y+1).get(x-2).getCurrency()==1) {
                Obje obje2 = objeler.get(y+1).get(x-2);
               // Dinamik.toplam(beyazPuan,Dinamik.hamleBeyaz(objeler,obje2,siyahPuan));
                siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);


                }
                if ((y+2)<8 && (x-1)>=0 && objeler.get(y+2).get(x-1).getColor().equals("siyah") &&objeler.get(y+2).get(x-1).getCurrency()==1) {
                Obje obje2 = objeler.get(y+2).get(x-1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);



                }
                if ((y+2)<8 && (x+1)<8 && objeler.get(y+2).get(x+1).getColor().equals("siyah") &&objeler.get(y+2).get(x+1).getCurrency()==1) {
                Obje obje2 = objeler.get(y+2).get(x+1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);



                }
                if ((y+1)<8 && (x+2)<8 && objeler.get(y+1).get(x+2).getColor().equals("siyah") &&objeler.get(y+1).get(x+2).getCurrency()==1) {
                Obje obje2 = objeler.get(y+1).get(x+2);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);


                }
                if ((y-1)>=0 && (x+2)<8 && objeler.get(y-1).get(x+2).getColor().equals("siyah") &&objeler.get(y-1).get(x+2).getCurrency()==1) {
                Obje obje2 = objeler.get(y-1).get(x+2);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);

                }
                if ((y-2)>=0 && (x+1)<8 && objeler.get(y-2).get(x+1).getColor().equals("siyah") &&objeler.get(y-2).get(x+1).getCurrency()==1) {
                Obje obje2 = objeler.get(y-2).get(x+1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);


                }
                if ((y-2)>=0 && (x-1)>=0 && objeler.get(y-2).get(x-1).getColor().equals("siyah") &&objeler.get(y-2).get(x-1).getCurrency()==1) {
                Obje obje2 = objeler.get(y-2).get(x-1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);

                }
                if ((y-1)>=0 && (x-2)>=0 && objeler.get(y-1).get(x-2).getColor().equals("siyah") &&objeler.get(y-1).get(x-2).getCurrency()==1) {
                Obje obje2 = objeler.get(y-1).get(x-2);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);



                }
        }

        else if(at.getColor().equals("siyah")){

                siyahPuan=siyahPuan+3;

                if ((y+1)<8  && (x-2)>=0 && objeler.get(y+1).get(x-2).getColor().equals("beyaz") &&objeler.get(y+1).get(x-2).getCurrency()==1) {
                    Obje obje2 = objeler.get(y+1).get(x-2);

                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                }
                if ((y+2)<8 && (x-1)>=0 && objeler.get(y+2).get(x-1).getColor().equals("beyaz") &&objeler.get(y+2).get(x-1).getCurrency()==1) {
                    Obje obje2 = objeler.get(y+2).get(x-1);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

                }
                if ((y+2)<8 && (x+1)<8 && objeler.get(y+2).get(x+1).getColor().equals("beyaz") &&objeler.get(y+2).get(x+1).getCurrency()==1) {
                    Obje obje2 = objeler.get(y+2).get(x+1);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

                }
                if ((y+1)<8 && (x+2)<8 && objeler.get(y+1).get(x+2).getColor().equals("beyaz") &&objeler.get(y+1).get(x+2).getCurrency()==1) {
                    Obje obje2 = objeler.get(y+1).get(x+2);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

                }
                if ((y-1)>=0 && (x+2)<8 && objeler.get(y-1).get(x+2).getColor().equals("beyaz") &&objeler.get(y-1).get(x+2).getCurrency()==1) {
                    Obje obje2 = objeler.get(y-1).get(x+2);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

                }
                if ((y-2)>=0 && (x+1)<8 && objeler.get(y-2).get(x+1).getColor().equals("beyaz") &&objeler.get(y-2).get(x+1).getCurrency()==1) {
                    Obje obje2 = objeler.get(y-2).get(x+1);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

                }
                if ((y-2)>=0 && (x-1)>=0 && objeler.get(y-2).get(x-1).getColor().equals("beyaz") &&objeler.get(y-2).get(x-1).getCurrency()==1) {
                    Obje obje2 = objeler.get(y-2).get(x-1);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

                }
                if ((y-1)>=0 && (x-2)>=0 && objeler.get(y-1).get(x-2).getColor().equals("beyaz") &&objeler.get(y-1).get(x-2).getCurrency()==1) {
                    Obje obje2 = objeler.get(y-1).get(x-2);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

                }
        }
        total.add(beyazPuan);
        total.add(siyahPuan);
        return total;

}


}
