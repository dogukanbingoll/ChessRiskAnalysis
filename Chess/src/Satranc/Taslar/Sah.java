
package Satranc.Taslar;

import Satranc.Dinamik;

import java.util.ArrayList;

public class Sah extends Obje {
    public Sah(String name, String color, int position) {
        super(name, color, position);
    }

    public ArrayList<Double> sahHareket(Sah sah, int x, int y, ArrayList<ArrayList<Obje>> objeler) {
        ArrayList<Obje> list1 = objeler.get(y);
        Obje obje1 = list1.get(x);
        ArrayList<Double> total = new ArrayList<Double>();
        double beyazPuan = 0;
        double siyahPuan = 0;

        if (sah.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan + 100;

            ///--SAG-SOL------------------------------------------

                if ((x - 1) >= 0 && objeler.get(y).get(x - 1).getColor() != "beyaz" && objeler.get(y).get(x - 1).getColor()!="--" && objeler.get(y).get(x - 1).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y).get(x - 1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                }
                if ((x + 1) < 8 && objeler.get(y).get(x + 1).getColor() != "beyaz" && objeler.get(y).get(x + 1).getColor()!="--"&& objeler.get(y).get(x + 1).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y).get(x + 1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                }
                if ((y - 1) >= 0 && objeler.get(y - 1).get(x).getColor() != "beyaz" &&objeler.get(y-1).get(x).getColor()!="--"&& objeler.get(y - 1).get(x).getCurrency() == 1) {
                     Obje obje2 = objeler.get(y - 1).get(x);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                }
                if ((y + 1) < 8 && objeler.get(y + 1).get(x).getColor() != "beyaz"&&objeler.get(y+1).get(x).getColor()!="--" && objeler.get(y + 1).get(x).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y + 1).get(x);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                 }

            ///---CAPRAZ------------------------
                if ((y +1 ) <8 && (x-1)>=0 && objeler.get(y+1).get(x-1).getColor() != "beyaz"&&objeler.get(y+1).get(x - 1).getColor()!="--" && objeler.get(y+1).get(x-1).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y + 1).get(x - 1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                }
                if ((x + 1) < 8 && (y+1)<8 && objeler.get(y+1).get(x + 1).getColor() != "beyaz" &&objeler.get(y+1).get(x + 1).getColor()!="--"&& objeler.get(y+1).get(x + 1).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y+1).get(x + 1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);

                }
                if ((y - 1) >=0 && (x-1)>=0 && objeler.get(y - 1).get(x-1).getColor() != "beyaz" &&objeler.get(y-1).get(x - 1).getColor()!="--" &&objeler.get(y - 1).get(x-1).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y-1).get(x-1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                }
                if ((y - 1) >= 0 && (x+1)<8 && objeler.get(y-1).get(x+1).getColor() != "beyaz"&&objeler.get(y-1).get(x + 1).getColor()!="--" && objeler.get(y -1).get(x+1).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y-1).get(x+1);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                }

        }
        else if (sah.getColor().equals("siyah")) {
            siyahPuan = siyahPuan + 100;
            //-------SAG-SOL--------------------
            if ((x - 1) >= 0 && objeler.get(y).get(x - 1).getColor() != "siyah" &&objeler.get(y).get(x -1).getColor()!="--" &&objeler.get(y).get(x - 1).getCurrency() == 1) {
                Obje obje2 = objeler.get(y).get(x - 1);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
            }
            if ((x + 1) < 8 && objeler.get(y).get(x + 1).getColor() != "siyah" &&objeler.get(y).get(x + 1).getColor()!="--"&& objeler.get(y).get(x + 1).getCurrency() == 1) {
                Obje obje2 = objeler.get(y).get(x + 1);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
            }
            if ((y - 1) >= 0 && objeler.get(y - 1).get(x).getColor() != "siyah" &&objeler.get(y-1).get(x).getColor()!="--"&& objeler.get(y - 1).get(x).getCurrency() == 1) {
                Obje obje2 = objeler.get(y - 1).get(x);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

            }
            if ((y + 1) < 8 && objeler.get(y + 1).get(x).getColor() != "siyah" &&objeler.get(y+1).get(x).getColor()!="--"&& objeler.get(y + 1).get(x).getCurrency() == 1) {
                Obje obje2 = objeler.get(y + 1).get(x);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
            }
            //-----CAPRAZ-------------------------
            if ((x - 1)>=0 && (y+1)<8 && objeler.get(y+1).get(x - 1).getColor() != "siyah"&&objeler.get(y+1).get(x - 1).getColor()!="--" && objeler.get(y+1).get(x - 1).getCurrency() == 1) {
                Obje obje2 = objeler.get(y+1).get(x - 1);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
            }
            if ((x + 1) < 8 && (y+1)<8 && objeler.get(y+1).get(x + 1).getColor() != "siyah"&&objeler.get(y+1).get(x + 1).getColor()!="--" && objeler.get(y+1).get(x + 1).getCurrency() == 1) {
                Obje obje2 = objeler.get(y+1).get(x + 1);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);

            }
            if ((y - 1) >= 0 && (x-1)>=0 && objeler.get(y - 1).get(x-1).getColor() != "siyah"&&objeler.get(y-1).get(x - 1).getColor()!="--" && objeler.get(y - 1).get(x-1).getCurrency() == 1) {
                Obje obje2 = objeler.get(y-1).get(x-1);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
            }
            if ((y - 1) >= 0 && (x+1)<8 && objeler.get(y - 1).get(x+1).getColor() != "siyah" &&objeler.get(y-1).get(x + 1).getColor()!="--"&& objeler.get(y - 1).get(x+1).getCurrency() == 1) {
                Obje obje2 = objeler.get(y - 1).get(x+1);
                beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
            }
        }
        total.add(beyazPuan);
        total.add(siyahPuan);
        return total;
    }

}

