package Satranc;


import Satranc.Taslar.*;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Board {

    //Input dosyasının okunması ve risk analizi için kullanılacak fonksiyon
    public static ArrayList<String> boardCreator(String fileName) {
        //İnputu txt dosyasından çekme
        File file = new File(fileName);
        ArrayList<String> board = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            ArrayList<List<String>> list1 = new ArrayList<List<String>>();

            String line;
            int i = 0;
            //txt dosyasındaki inputların satır satır ayrılarak array'olarak kaydedilmesi
            while ((line = br.readLine()) != null) {
                list1.add(Arrays.asList(line.split(" ")));
                i++;

            }
            fileReader.close();


            ArrayList<Obje> allObjects = new ArrayList<Obje>();
            ArrayList<ArrayList<Obje>> objects = new ArrayList<ArrayList<Obje>>();

            //Stringe çevirilen taşların adlandırılması ve renklendirilmesi
            //Renker taşların değerlendirilmesi için,currency değeri ise bir taşın yalnızca
            //bir kere değer kaybetmesi için kullanılacaktır
            for(int j=0;j<list1.size();j++){
                List<String> selectedList=list1.get(j);

                for(String s:selectedList){
                    Obje obje;
                    if (s.equals("pb")) {
                        allObjects.add(new Piyon("piyon", "beyaz", 1));
                    } else if (s.equals("ab")) {
                        allObjects.add(new At("at", "beyaz", 1));
                    } else if (s.equals("kb")) {
                        allObjects.add(new Kale("kale", "beyaz", 1));
                    } else if (s.equals("fb")) {
                        allObjects.add(new Fil("fil", "beyaz", 1));
                    } else if (s.equals("sb")) {
                        allObjects.add(new Sah("sah", "beyaz", 1));
                    } else if (s.equals("vb")) {
                        allObjects.add(new Vezir("vezir", "beyaz", 1));
                    } else if (s.equals("ps")) {
                        allObjects.add(new Piyon("piyon", "siyah", 1));
                    } else if (s.equals("as")) {
                        allObjects.add(new At("at", "siyah", 1));
                    } else if (s.equals("ks")) {
                        allObjects.add(new Kale("kale", "siyah", 1));
                    } else if (s.equals("ss")) {
                        allObjects.add(new Sah("sah", "siyah", 1));
                    } else if (s.equals("vs")) {
                        allObjects.add(new Vezir("vezir", "siyah", 1));
                    } else if (s.equals("fs")) {
                        allObjects.add(new Fil("fil", "siyah", 1));
                    } else {
                        allObjects.add(new Bosluk("bosluk", "--", 1));
                    }
                }

            }
            //Input dosyasından objelere çevrilen girdilerin kaydedilmesi
            int l=0;
            for(int k=0;k<64;k=k+8){
                ArrayList<Obje> fakeObject=new ArrayList<Obje>();
                fakeObject.add(allObjects.get(k));
                fakeObject.add(allObjects.get(k+1));
                fakeObject.add(allObjects.get(k+2));
                fakeObject.add(allObjects.get(k+3));
                fakeObject.add(allObjects.get(k+4));
                fakeObject.add(allObjects.get(k+5));
                fakeObject.add(allObjects.get(k+6));
                fakeObject.add(allObjects.get(k+7));
                Collections.reverse(fakeObject);
                objects.add(fakeObject);

            }
            Collections.reverse(objects);


            //Objelerin bulunduğu ArrayList'den her bir objenin çekilerek
            //risk analizinin yapılması
            double beyazToplam=0;
            double siyahToplam=0;
            for(ArrayList<Obje> objeArray:objects){
                for(Obje obje:objeArray){
                    if(obje.getClass().equals(Piyon.class)){
                        ArrayList<Double> toplamlar=  ((Piyon) obje).piyonHareket((Piyon)obje,
                                objeArray.indexOf(obje),objects.indexOf(objeArray),objects);
                        siyahToplam=siyahToplam+toplamlar.get(1);
                        beyazToplam=beyazToplam+toplamlar.get(0);
                    }
                    else if(obje.getClass().equals(At.class)){
                        ArrayList<Double> toplamlar=  ((At) obje).atHareket((At)obje,
                                objeArray.indexOf(obje),objects.indexOf(objeArray),objects);
                        siyahToplam=siyahToplam+toplamlar.get(1);
                        beyazToplam=beyazToplam+toplamlar.get(0);

                    }
                    else if(obje.getClass().equals(Kale.class)){
                        ArrayList<Double> toplamlar=  ((Kale) obje).kaleHareket((Kale)obje,
                                objeArray.indexOf(obje),objects.indexOf(objeArray),objects);
                        siyahToplam=siyahToplam+toplamlar.get(1);
                        beyazToplam=beyazToplam+toplamlar.get(0);

                    }
                    else if(obje.getClass().equals(Fil.class)){
                        ArrayList<Double> toplamlar=  ((Fil) obje).filHareket((Fil)obje,
                                objeArray.indexOf(obje),objects.indexOf(objeArray),objects);
                        siyahToplam=siyahToplam+toplamlar.get(1);
                        beyazToplam=beyazToplam+toplamlar.get(0);

                    }
                    else if(obje.getClass().equals(Vezir.class)){
                        ArrayList<Double> toplamlar=  ((Vezir) obje).vezirHareket((Vezir)obje,
                                objeArray.indexOf(obje),objects.indexOf(objeArray),objects);
                        siyahToplam=siyahToplam+toplamlar.get(1);
                        beyazToplam=beyazToplam+toplamlar.get(0);

                    }
                    else if(obje.getClass().equals(Sah.class)){
                        ArrayList<Double> toplamlar=  ((Sah) obje).sahHareket((Sah)obje,
                                objeArray.indexOf(obje),objects.indexOf(objeArray),objects);
                        siyahToplam=siyahToplam+toplamlar.get(1);
                        beyazToplam=beyazToplam+toplamlar.get(0);

                    }

                }

            }

            System.out.println("Siyah toplam:"+ siyahToplam);
            System.out.println("Beyaz toplam:"+ beyazToplam);






        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return board;
    }
    public static void main(String[] args) {
        boardCreator("C:\\Users\\dogukan.bingol\\Desktop\\board2.txt");


    }
}

