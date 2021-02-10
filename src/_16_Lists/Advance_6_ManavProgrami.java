package _16_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance_6_ManavProgrami {

    /*
     * Basit bir manav alisveris programi yaziniz.
     *
     * 1. Adým : Ürün listesinden ürün seçtir ve kaç kilo oldugunu sor.
     * 2. Adým : Baska bir ürün almak isteyip istemedigini sor.
     * 			 Istemiyorsa toplam miktari göster, istiyorsa tekrar ürün seçtir.
     * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adým : Muster her ürün seçtiginde, aldýðý ürünün fiyatini toplam fiyata ekle.
     * 4. Adým : Alisveris bitince toplam ödemesi gereken tutari göster.
     *
     * */


    static List<String> urunListesi  = new ArrayList<>();		/// ilk önce burayý oluþturalým.
    static List<Float> urunFiyatlari  = new ArrayList<>();
    static float toplamOdenecekTutar;


    public static void main(String[] args) {

        urunListesi.add("Domates - Urun Kodu : 0");
        urunListesi.add("Biber - Urun Kodu : 1");
        urunListesi.add("Erik - Urun Kodu : 2");
        urunListesi.add("Karpuz - Urun Kodu : 3");
        urunListesi.add("Havuç - Urun Kodu : 4");

        urunFiyatlari.add(2.0f);
        urunFiyatlari.add(3.0f);
        urunFiyatlari.add(10.0f);
        urunFiyatlari.add(5.0f);
        urunFiyatlari.add(3.0f);

        System.out.println(urunListesi.toString());

        musteriyeNeSecmekIstediginiSor();


    }


    private static void musteriyeNeSecmekIstediginiSor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi ürünü seçmek istersiniz ?");
        int secim = scan.nextInt();
        System.out.println("Kaç kilo almak istersiniz ?");
        float kilo = scan.nextFloat();
        float urunFiyati = urunFiyatlari.get(secim);

        float toplamUrunFiyati = kilo * urunFiyati;
        toplamOdenecekTutar += toplamUrunFiyati;

        System.out.println("Seçtiginiz ürün : " +urunListesi.get(secim));
        System.out.println("Ürünün Fiyati : "   +toplamUrunFiyati);

        System.out.println("Alisverise devam etmek isterseniz 1, kasaya gitmek isterseniz 2 yaziniz : ");
        int karar = scan.nextInt();
        if(karar == 1)
            musteriyeNeSecmekIstediginiSor();
        else
            kasayaGit();


    }


    private static void kasayaGit() {
        System.out.println("Toplam ödenecek tutar : " + toplamOdenecekTutar);

    }

}
