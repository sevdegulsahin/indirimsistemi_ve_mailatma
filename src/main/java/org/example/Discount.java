package org.example;

public class Discount {
    private static final double premiumIndirim=0.20;
    private static final double goldIndirim=0.15;
    private static final double silverIndirim=0.10;
    private static final double urunIndirimi=0.10;
    public static double indirimHesapla(Customer customer,double indirimOncesiFiyat){
        double indirim=0.0;
        switch (customer.getUyelikTuru()){
            case "premium": indirim=premiumIndirim;
                break;
            case "gold": indirim=goldIndirim;
                break;
            case "silver": indirim=silverIndirim;
                break;
            default: break;

        }
       double uyeIndirimi=indirimOncesiFiyat*indirim;
       double UrunIndirimi=indirimOncesiFiyat*urunIndirimi;
        return uyeIndirimi+UrunIndirimi;
    }
}
