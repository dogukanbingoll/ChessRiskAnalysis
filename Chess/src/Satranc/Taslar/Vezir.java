package Satranc.Taslar;

import Satranc.Dinamik;

import java.util.ArrayList;

public class Vezir extends Obje {
    public Vezir(String name, String color, int position) {
        super(name, color, position);
    }

    public ArrayList<Double> vezirHareket(Vezir vezir, int x, int y, ArrayList<ArrayList<Obje>> objeler) {
        ArrayList<Obje> list1 = objeler.get(y);
        Obje obje1 = list1.get(x);
        ArrayList<Double> total = new ArrayList<Double>();
        double beyazPuan = 0;
        double siyahPuan = 0;

        if (vezir.getColor().equals("beyaz")) {
            beyazPuan = beyazPuan + 9;

            ///--SAG-SOL------------------------------------------
            for (int i = 1; i < (x - objeler.indexOf(objeler.get(y).get(0))); i++) {
                if ((x - i) >= 0 && objeler.get(y).get(x - i).getColor() != "beyaz" && objeler.get(y).get(x - i).getColor()!="--" && objeler.get(y).get(x - i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y).get(x - i);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    break;
                }
            }
            for (int i = 1; i < 8 - x; i++) {
                if ((x + i) < 8 && objeler.get(y).get(x + i).getColor() != "beyaz" && objeler.get(y).get(x + i).getColor()!="--"&& objeler.get(y).get(x + i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y).get(x + i);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    break;
                }
            }
            for (int i = 1; i <= (y - objeler.indexOf(objeler.get(0))); i++) {

                if ((y - i) >= 0 && objeler.get(y - i).get(x).getColor() != "beyaz" &&objeler.get(y-i).get(x).getColor()!="--"&& objeler.get(y - i).get(x).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y - i).get(x);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    break;
                }
            }
            for (int i = 1; i < (objeler.indexOf(objeler.get(7))) - y; i++) {
                if ((y + i) < 8 && objeler.get(y + i).get(x).getColor() != "beyaz"&&objeler.get(y+i).get(x).getColor()!="--" && objeler.get(y + i).get(x).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y + i).get(x);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    break;
                }
            }

            ///---CAPRAZ------------------------
            for (int i = 1; i < (x - objeler.indexOf(objeler.get(y).get(0))); i++) {
                if ((y +i ) <8 && (x-i)>=0 && objeler.get(y+i).get(x-i).getColor() != "beyaz"&&objeler.get(y+i).get(x - i).getColor()!="--" && objeler.get(y+i).get(x-i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y + i).get(x - i);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);

                }

            }
            for (int i = 1; i < 8- x; i++) {
                if ((x + i) < 8 && (y+i)<8 && objeler.get(y+i).get(x + i).getColor() != "beyaz" &&objeler.get(y+i).get(x + i).getColor()!="--"&& objeler.get(y+i).get(x + i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y+i).get(x + i);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    break;

                }

            }
            for (int i = 1; i <= (y - objeler.indexOf(objeler.get(0))); i++) {
                if ((y - i) >=0 && (x-i)>=0 && objeler.get(y - i).get(x-i).getColor() != "beyaz" &&objeler.get(y-i).get(x - i).getColor()!="--" &&objeler.get(y - i).get(x-i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y-i).get(x-i);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    break;

                }

            }
            for (int i = 1; i < (objeler.indexOf(objeler.get(7))) - y; i++) {
                if ((y - i) >= 0 && (x+i)<8 && objeler.get(y-i).get(x+i).getColor() != "beyaz"&&objeler.get(y-i).get(x + i).getColor()!="--" && objeler.get(y -i).get(x+i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y-i).get(x+i);
                    siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                    break;
                }

            }

        }
        else if (vezir.getColor().equals("siyah")) {
            siyahPuan = siyahPuan + 9;
            //-------SAG-SOL--------------------
            for (int i = 1; i < (x - objeler.indexOf(objeler.get(y).get(0))); i++) {
                if ((x - i) >= 0 && objeler.get(y).get(x - i).getColor() != "siyah" &&objeler.get(y).get(x -i).getColor()!="--" &&objeler.get(y).get(x - i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y).get(x - i);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;
                }
            }
            for (int i = 1; i < 8 - x; i++) {
                if ((x + i) < 8 && objeler.get(y).get(x + i).getColor() != "siyah" &&objeler.get(y).get(x + i).getColor()!="--"&& objeler.get(y).get(x + i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y).get(x + i);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;
                }
            }
            for (int i = 1; i <= (y - objeler.indexOf(objeler.get(0))); i++) {
                if ((y - i) >= 0 && objeler.get(y - i).get(x).getColor() != "siyah" &&objeler.get(y-i).get(x).getColor()!="--"&& objeler.get(y - i).get(x).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y - i).get(x);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;

                }
            }
            for (int i = 1; i < (objeler.indexOf(objeler.get(7))) - y; i++) {
                if ((y + i) < 8 && objeler.get(y + i).get(x).getColor() != "siyah" &&objeler.get(y+i).get(x).getColor()!="--"&& objeler.get(y + i).get(x).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y + i).get(x);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;
                }


            }
            //-----CAPRAZ-------------------------
            for (int i = 1; i < (x - objeler.indexOf(objeler.get(y).get(0))); i++) {
                if ((x - i)>=0 && (y+i)<8 && objeler.get(y+i).get(x - i).getColor() != "siyah"&&objeler.get(y+i).get(x - i).getColor()!="--" && objeler.get(y+i).get(x - i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y+i).get(x - i);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;
                }

            }
            for (int i = 1; i < 8- x; i++) {
                if ((x + i) < 8 && (y+i)<8 && objeler.get(y+i).get(x + i).getColor() != "siyah"&&objeler.get(y+i).get(x + i).getColor()!="--" && objeler.get(y+i).get(x + i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y+i).get(x + i);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;

                }

            }
            for (int i = 1; i <= (y - objeler.indexOf(objeler.get(0))); i++) {
                if ((y - i) >= 0 && (x-i)>=0 && objeler.get(y - i).get(x-i).getColor() != "siyah"&&objeler.get(y-i).get(x - i).getColor()!="--" && objeler.get(y - i).get(x-i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y-i).get(x-i);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;
                }

            }
            for (int i = 1; i < (objeler.indexOf(objeler.get(7))) - y; i++) {
                if ((y - i) >= 0 && (x+1)<8 && objeler.get(y - i).get(x+i).getColor() != "siyah" &&objeler.get(y-i).get(x + i).getColor()!="--"&& objeler.get(y - i).get(x+i).getCurrency() == 1) {
                    Obje obje2 = objeler.get(y - i).get(x+i);
                    beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                    break;
                }

            }
        }
        total.add(beyazPuan);
        total.add(siyahPuan);
        return total;
    }
}
