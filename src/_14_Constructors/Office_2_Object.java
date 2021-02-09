package _14_Constructors;

public class Office_2_Object {

    public static void main(String[] args) {
        /*
         * - Office_2_Object Class’i olusturun burada Office_1_OgretmenBilgileri Clasindan
         * object ureterek yeni
         * ogretmenler olusturun ve bilgilerini yazdirin
         */


        Office_1_OgretmenBilgileri obj= new Office_1_OgretmenBilgileri();
        obj.isim="hasan";
        obj.soyisim="Gun";
        obj.brans="fizik";
        obj.tel="5421234567";
        System.out.println(obj.isim +", "+obj.soyisim+", "+obj.brans+", "+obj.tel);


        Office_1_OgretmenBilgileri obj1= new Office_1_OgretmenBilgileri();
        obj1.isim="ayse";
        obj1.soyisim="Gunduz";
        obj1.brans="tarih";
        obj1.tel="5421234568";
        System.out.println(obj1.isim +", "+obj1.soyisim+", "+obj1.brans+", "+obj1.tel);

        System.out.println(Office_1_OgretmenBilgileri.getOkulIsmi());


    }

}
