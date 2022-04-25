package Satranc.Taslar;

import Satranc.Dinamik;

import java.util.ArrayList;

public class Kale extends Obje {
    public Kale(String name, String color, int currency) {
        super(name, color, currency);
    }

    public ArrayList<Double> kaleHareket(Kale kale, int x, int y, ArrayList<ArrayList<Obje>> objeler) {

        ArrayList<Obje> list1 = objeler.get(y);
        Obje obje1 = list1.get(x);
        double beyazPuan = 0;
        double siyahPuan = 0;
        ArrayList<Double> total=new ArrayList<Double>();




            if (kale.getColor().equals("beyaz")) {
                beyazPuan = beyazPuan + 5;

                    for (int i = 1; i < (x - objeler.indexOf(objeler.get(y).get(0))); i++) {
                        if ((x - i) >= 0 && objeler.get(y).get(x - i).getColor() != "beyaz"&&objeler.get(y).get(x - i).getColor() != "--" && objeler.get(y).get(x - i).getCurrency() == 1) {
                            Obje obje2 = objeler.get(y).get(x - i);
                            siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                        break;}

                    }


                    for (int i = 1; i < 8- x; i++) {
                        if ((x + i) < 8 && objeler.get(y).get(x + i).getColor() != "beyaz" &&objeler.get(y).get(x + i).getColor() != "--"&& objeler.get(y).get(x + i).getCurrency() == 1) {

                            Obje obje2 = objeler.get(y).get(x + i);
                            siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                        break;}

                    }


                    for (int i = 1; i <= (y - objeler.indexOf(objeler.get(0))); i++) {

                        if ((y - i) >= 0 && objeler.get(y - i).get(x).getColor() != "beyaz"&&objeler.get(y - i).get(x).getColor() != "--" && objeler.get(y - i).get(x).getCurrency() == 1) {
                            Obje obje2 = objeler.get(y-i).get(x);
                            siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                        break;}

                    }



                    for (int i = 1; i < (objeler.indexOf(objeler.get(7))) - y; i++) {
                        if ((y + i) < 8 && objeler.get(y+i).get(x).getColor() != "beyaz"&&objeler.get(y+i).get(x).getColor() != "--" && objeler.get(y + i).get(x).getCurrency() == 1) {
                            Obje obje2 = objeler.get(y+i).get(x);
                            siyahPuan=siyahPuan+Dinamik.hamleBeyaz(objeler,obje2,siyahPuan);
                        break;}



                    }


            } else if (kale.getColor().equals("siyah")) {
                siyahPuan = siyahPuan + 5;


                    for (int i = 1; i < (x - objeler.indexOf(objeler.get(y).get(0))); i++) {
                        if ((x - i) >= 0 && objeler.get(y).get(x - i).getColor() != "siyah" &&objeler.get(y).get(x - i).getColor() != "--"&& objeler.get(y).get(x - i).getCurrency() == 1) {
                            Obje obje2 = objeler.get(y).get(x - i);
                            beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                            break;
                        }

                    }



                    for (int i = 1; i < 8 - x; i++) {
                        if ((x + i) < 8 && objeler.get(y).get(x + i).getColor() != "siyah" &&objeler.get(y).get(x + i).getColor() != "--" && objeler.get(y).get(x + i).getCurrency() == 1) {
                            Obje obje2 = objeler.get(y).get(x + i);
                            beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                            break;
                        }

                    }


                    for (int i = 1; i <=(y-objeler.indexOf(objeler.get(0))) ; i++) {
                        if ((y - i) >= 0 && objeler.get(y - i).get(x).getColor() != "siyah"&&objeler.get(y - i).get(x).getColor() != "--" && objeler.get(y - i).get(x).getCurrency() == 1) {
                            Obje obje2 = objeler.get(y-i).get(x);
                            beyazPuan=beyazPuan+Dinamik.hamleSiyah(objeler,obje2,beyazPuan);
                            break;
                        }

                    }


                    for (int i = 1; i < (objeler.indexOf(objeler.get(7))) - y; i++) {
                        if ((y + i) < 8 && objeler.get(y + i).get(x).getColor() != "siyah"&&objeler.get(y + i).get(x).getColor() != "--"  && objeler.get(y + i).get(x).getCurrency() == 1) {
                            Obje obje2 = objeler.get(y + i).get(x);
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