package org.example;

public class Customer {  private String musteriAdi;
    private String musteriSoyadi;
    private String musteriMaili;
    private String uyelikTuru;
    public Customer(String musteriAdi,String musteriSoyadi,String musteriMaili,String uyelikTuru){
        this.musteriAdi=musteriAdi;
        this.musteriMaili=musteriMaili;
        this.musteriSoyadi=musteriSoyadi;
        this.uyelikTuru=uyelikTuru; }

    public String getMusteriMaili() {
        return musteriMaili;
    }
    public String getUyelikTuru() {
        return uyelikTuru;
    }
    public void setUyelikTuru(String uyelikTuru) {
        this.uyelikTuru = uyelikTuru;
    }
    public void setMusteriMaili(String musteriMaili) {
        this.musteriMaili = musteriMaili;
    }
    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }
    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }
    public String getMusteriAdi() {
        return musteriAdi;
    }
    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }


}


