import java.util.ArrayList;
import java.util.List;

public class Ogretmen {

    String ad;
    String soyAd;
    Long kimlikNo;
    int yaş;
    String bölüm;
    int sicilNo;


    public Ogretmen(String ad, String soyAd, Long kimlikNo, int yaş, String bölüm, int sicilNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.kimlikNo = kimlikNo;
        this.yaş = yaş;
        this.bölüm = bölüm;
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", kimlikNo=" + kimlikNo +
                ", yaş=" + yaş +
                ", bölüm='" + bölüm + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }
}
