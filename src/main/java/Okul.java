import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Okul {

//    BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.
//   1. Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
//    Kayıtlarda şu bilgiler olabilmelidir.
//    Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
//    Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
//            2. Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
//    Aşağıdaki gibi bir menü gösterilsin.
//   ==================== ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ    ===================
//            1- ÖĞRENCİ İŞLEMLERİ
//   2- ÖĞRETMEN İŞLEMLERİ
//    Q- ÇIKIŞ
//   3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
//            ============= İŞLEMLER =============
//            1-EKLEME
//   2-ARAMA
//   3-LİSTELEME
//   4-SİLME
//   5-ANA MENÜ
//    Q-ÇIKIŞ
//    SEÇİMİNİZ:
//            4. İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
//    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
//    Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
//

    List<Ogretmen> ogrt = new ArrayList<>();
    List<Ogrenci> ogrn = new ArrayList<>();

    Scanner input = new Scanner(System.in);


    public void menu() {


        System.out.println("==================== ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ    ===================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ \n 2- ÖĞRETMEN İŞLEMLERİ");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                ogrenciİsleri();
                break;

            case 2:
                ogretmenİslemler();
                break;

        }
    }

    private void ogrenciİsleri() {
        System.out.println("1-Öğrenci Ekle \n 2-Öğrenci Arama \n 3-Öğrenci Listeleme \n 4-Öğrenci Sil \n 5 -Ana Menü \n 6- Çıkış");
        int tipSec = input.nextInt();
        switch (tipSec) {
            case 1:
                ogrenciEkleme();
                ogrenciİsleri();
                break;
            case 2:
                aramaOgrenci();
                ogrenciİsleri();
                break;
            case 3:
                listelemeOgrenci();
                ogrenciİsleri();
                break;
            case 4:
                silmeOgrenci();
                ogrenciİsleri();
                break;
            case 5:
                menu();
                break;
            case 6:
                cikis();
                break;

        }
    }


    private void ogretmenİslemler() {
        System.out.println("1-Öğretmen Ekle \n 2-Öğretmen Arama \n 3-Öğretmen Listeleme \n 4-Öğretmen Sil \n 5 -Ana Menü \n 6- Çıkış");
        int secim = input.nextInt();


        switch (secim) {

            case 1:
                ekleme();
                ogretmenİslemler();
                break;
            case 2:
                arama();
                ogretmenİslemler();
                break;
            case 3:
                listeleme();
                ogretmenİslemler();
                break;
            case 4:
                silme();
                ogretmenİslemler();
                break;
            case 5:
                menu();
                break;


        }


    }

    private void arama() {
        System.out.println("lütfen aramak istediğiniz öğretmenin sicil numarasını giriniz.");
        int sic = input.nextInt();
        for (Ogretmen w : ogrt) {
            if (w.sicilNo == sic) {
                System.out.println(w);
            }


            }

        }



    private void listeleme() {
        for (Ogretmen w : ogrt) {
            System.out.println(w);
        }
    }


    private void silme() {
        System.out.println("lütfen listeden silmek istediğiniz öğretmenin sicil numarasını giriniz.");
        int sicil = input.nextInt();

        for (Ogretmen w : ogrt) {
            if (sicil == w.sicilNo) {
                ogrt.remove(w);
            } else {
                System.out.println("Silmek istenilen sicil no bulunamadı");

            }


        }
        System.out.println("silme işlemi tamamlandı.");
    }

    private void cikis() {

        System.out.println("Çıkış işlemi tamamlandı.");
    }

    private void ekleme() {
        System.out.println("Lütfen isim giriniz.");
        String isim = input.next();
        System.out.println("lütfen soyad giriniz.");
        String soyİsim = input.next();
        System.out.println("lütfen kimlik no giriniz.");
        Long kimlikNo = input.nextLong();
        System.out.println("Lütfen yaş giriniz.");
        byte yaş = input.nextByte();
        System.out.println("Lütfen bölümü giriniz.");
        String bölüm = input.next();

        System.out.println("Lütfen sicil bilgilerini giriniz.");
        int sicilNo = input.nextInt();
        ogrt.add(new Ogretmen(isim, soyİsim, kimlikNo, yaş, bölüm, sicilNo));
        System.out.println(ogrt);
    }


    private void ogrenciEkleme() {
        System.out.println("Lütfen isim giriniz.");
        String isim = input.next();

        System.out.println("lütfen soyad giriniz.");
        String soyİsim = input.next();

        System.out.println("Lütfen yaş giriniz.");
        byte yaş = input.nextByte();

        System.out.println("Lütfen sınıf bilgisini giriniz.");
        String bölüm = input.next();

        System.out.println("Lütfen öğrenci numarasını giriniz.");
        int sicilNo = input.nextInt();

        ogrn.add(new Ogrenci(isim, soyİsim, yaş, bölüm, sicilNo));
        System.out.println(ogrn);
    }


    private void aramaOgrenci() {
        System.out.println("lütfen aramak istediğiniz öğrencini  numarasını giriniz.");
        int num = input.nextInt();
        for (Ogrenci w : ogrn) {
            if (w.numara == num) {
                System.out.println(w);
            } else {
                System.out.println("Girdiğiniz numara ile ilişkilendirilen bir öğrenci bulunamamıştır.");

            }
        }


    }

    private void listelemeOgrenci() {
        for (Ogrenci w : ogrn) {
            System.out.println(w);
        }
    }


    private void silmeOgrenci() {
        System.out.println("lütfen listeden silmek istediğiniz öğrencinin numarasını giriniz.");
        int numara = input.nextInt();

        for (Ogrenci w : ogrn) {
            if (numara == w.numara) {
                ogrt.remove(w);
                System.out.println("silme işlemi tamamlandı.");
            } else {
                System.out.println("Silmek istenilen no bulunamadı");

            }


        }

    }


}
