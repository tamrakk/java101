package Not_OrtalamaHesap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);

        //Değişkenler
        int matematik,fizik,kimya, turkce,tarih,muzık,toplam;
        double ortalama;
        boolean kosul1;
        String sonuc;


        System.out.println("Not Ortalama Hesaplama");

        //Değer alma

        System.out.print("Matematik Notunu Giriniz:");
        matematik = input.nextInt();

        System.out.print("Fizik Notunu Giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya Notunu Giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunu Giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih Notunu Giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik Notunu Giriniz:");
        muzık = input.nextInt();

        toplam = matematik + fizik + kimya + turkce + tarih + muzık;

        //ortalama hesaplama
          ortalama = toplam/6;
        System.out.println("Not Ortalamanız: "+ ortalama);

        // koşul Durumu
        kosul1 = ortalama >= 60;
        sonuc=(kosul1) ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(sonuc);








    }
}
