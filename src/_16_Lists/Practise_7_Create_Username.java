package _16_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Practise_7_Create_Username {

    /*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
	 *  1. Adım : Kullanıcıdan ismini isteyelim
	 *  2. Adım : Kullanıcı adındaki boşlukları silelim.
	 *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
	 *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, kullanıcının girdiği isim olsun.
	 *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, ve gösterelim.

		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayşe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");

	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kullanmak istediğiniz kullanıcı adını yazının : ");
        String girilenKullaniciAdi = scan.nextLine();
        String kullaniciAdi = girilenKullaniciAdi.replace(" ", "");

        System.out.println(kullaniciAdi);      // BURADA DUR  ****************

        // Veritabanı olayından bahset, List oluştur.

        List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
        veritabanindakiKullaniciListesi.add("Ahmet");
        veritabanindakiKullaniciListesi.add("Ayşe");
        veritabanindakiKullaniciListesi.add("Süleyman");
        veritabanindakiKullaniciListesi.add("Nazmi");
        veritabanindakiKullaniciListesi.add("Hamza06");

        // Twitter örneği verilebilir.

        boolean kullaniciAdiVeritabanindaVarMi = veritabanindakiKullaniciListesi.contains(kullaniciAdi);

        // Burada hem ternary hem if else kullanabiliriz

        if(kullaniciAdiVeritabanindaVarMi)
            System.out.println("Bu kullanıcı adı zaten alınmış.");
        else
            System.out.println("Bu kullanıcı adı alınabilir.");


        System.out.println(kullaniciAdiVeritabanindaVarMi ? "Bu kullanıcı adı zaten alınmış." : "Bu kullanıcı adı alınabilir.");

//4.ADIM
        if(kullaniciAdiVeritabanindaVarMi) {
            int rastgeleSayi = new Random().nextInt(100000);
            kullaniciAdi += ""+rastgeleSayi;
            System.out.println("Yeni Kullanıcı Adınız : " + kullaniciAdi);

        }else {
            System.out.println("Yeni Kullanıcı Adınız : " + kullaniciAdi);

        }






    }

}
