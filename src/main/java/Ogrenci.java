public class Ogrenci extends Okul{

    String ad;
    String soyAd;
    int yaş;
    String sınıfBilgisi;
    int numara;

    public Ogrenci(String ad, String soyAd, int yaş, String sınıfBilgisi, int numara) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yaş = yaş;
        this.sınıfBilgisi = sınıfBilgisi;
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yaş=" + yaş +
                ", sınıfBilgisi='" + sınıfBilgisi + '\'' +
                ", numara=" + numara +
                '}';
    }
}
