package _16_Lists;

import java.util.ArrayList;
import java.util.List;

public class Office_5_Find_dublicate_characters {

        /*
         * Kullancıdan aldığımız metindeki tekrar eden harfleri bulan program yazınız.
         *
         * 1. Adım : Kullanıcıdan bir metin girmesini isteyelim.
         * 2. Adım : Tüm harfleri, diğer harflerle karşılaştıralım.
         * 		Bunun için iç içe geçmiş for loop lar kullanalım.
         * 3. Adım : İçteki for loop'un içerisinde harfleri karşılaştıralım.
         * 		Eğer eşitlik varsa, tekrar ediyor demektir. Ekrana yazdıralım.
         *
         * İpucu : Tekrar eden harfleri ekrana yazdırırken birkaç kere yazdırmamak içini
         * 			bir tane List<Character> oncedenBulunanHarfler oluşturun ve bulduğunuz harfleri içine atın.
         * 		   Eğer harf zaten ekrana yazdırılmışsa, ekrana yazdırmayın.
         *
         * İpucu 2 : Boşluk " "  karakterini ekrana yazdırmamak için  (harf != ' ') eğer boşluğa eşit değilse
         * 			koşulunu kullanabilirsiniz.
         *
         * */

        public static void main(String[] args) {

            List<Character> oncedenBulunanHarfler = new ArrayList<>();
            String str = new String("Tekrar eden harfleri bulalım");


            char[] chars = str.toCharArray();
            System.out.println("Tekrar eden harfler şunlardır :");
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (chars[i] == chars[j]) {

                        if (chars[j] != ' ' && !oncedenBulunanHarfler.contains(chars[j])) {
                            oncedenBulunanHarfler.add(chars[j]);
                            System.out.println(chars[j]);
                            break;
                        }
                    }
                }
            }
        }
    }

