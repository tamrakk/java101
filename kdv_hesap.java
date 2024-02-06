package KDV_Hesaplama;
import java.util.Scanner;

public class kdv_hesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //değişken tanınlama

        double tutar,kdvOranı1=0.18,kdvOranı2=0.08,kdvliTutarı,kdvTutarı,sonuc;
        boolean kosul;

        System.out.println("KDV Hesaplama");
        System.out.print("Tutarı Geriniz:");// kullanıcından veri alma
        tutar=input.nextDouble();

        System.out.println("girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ," +
                " tutar 1000 TL'den büyük ise KDV oranını %8 olarak hesaplanır");

        //koşul
        kosul=tutar >=1000;
        kdvliTutarı=(kosul) ? (tutar+tutar*kdvOranı2) : (tutar+tutar*kdvOranı1);
        kdvTutarı=(kosul) ? (tutar*kdvOranı2) : (tutar*kdvOranı1);
        System.out.println("KDV'li Fiyat:" + kdvliTutarı);
        System.out.println("KDV Tutarı:" + kdvTutarı);



    }
}
