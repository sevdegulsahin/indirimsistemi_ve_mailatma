package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Customer> customerList = new ArrayList<>();
    public static void main(String[] args) {
                Scanner scanner =new Scanner(System.in);
                while (true){
                    System.out.println("XX firmasına hos geldiniz. Yapmak istediginiz islemi seciniz.\n" +
                            "1-Uye ol\n2-Urun satin al\n3-Uyelik bilgi guncelle\n4-Uyelik sil ");
                    int secim=scanner.nextInt();
                    scanner.nextLine();
                    switch (secim){
                        case 1: uyeOl(scanner);
                            break;
                        case 2: satinAlma(scanner);
                            break;
                        case 3: uyelikSilme(scanner);
                            System.out.println("yeni bilgilerinizi giriniz");
                            uyeOl(scanner);
                            System.out.println("bilgileriniz guncellendi");
                            break;
                        case 4: uyelikSilme(scanner);
                            break;
                        default:
                            System.out.println("yanlis secim tekrar deneyiniz");
                    }
                }
            }
            private static void uyeOl(Scanner scanner){
                System.out.println("Adinizi girin");
                String musteriAdi=scanner.nextLine();
                System.out.println("Soyadinizi giriniz");
                String musteriSoyadi=scanner.nextLine();
                System.out.println("Mailinizi giriniz");
                String musteriMaili=scanner.nextLine();
                System.out.println("Uyelik turunuzu giriniz");
                String uyelikTuru=scanner.nextLine();
                Customer customer=new Customer(musteriAdi,musteriSoyadi,musteriMaili,uyelikTuru);
                customerList.add(customer);
                System.out.println("Uyelik islemi basariyla tamamlandi.");
            }
            private static void satinAlma(Scanner scanner){
                System.out.println("Mailinizi giriniz");
                String mail=scanner.nextLine();
                Customer customer=musteriMailKontrol(mail);
                if (customer==null){
                    System.out.println("uye bulunmadi");
                    return;
                }double indirimOncesiFiyat=1500;
                System.out.println("aldiginiz urunler 1500 TL tutmustur");
                double indirimTutari=Discount.indirimHesapla(customer,indirimOncesiFiyat);
                double odenecekTutar=indirimOncesiFiyat-indirimTutari;
                EmailSender.sendPlainTextEmail("sevdegulsahin25@gmail.com", "customer.getMusteriMaili()", "Fatura","faturanız iletilmiştir",true);
            }
            private static void uyelikSilme(Scanner scanner) {
                System.out.println("Mailinizi giriniz");
                String mail = scanner.nextLine();
                Customer customer = musteriMailKontrol(mail);
                if (customer == null) {
                    System.out.println("uye bulunmadi");
                    return;
                }
                customerList.remove(customer);
                System.out.println("uyeliginiz silinmistir");
            }
            private static Customer musteriMailKontrol(String mail) {
                for (Customer customer : customerList) {
                    if (customer.getMusteriMaili().equalsIgnoreCase(mail)) {
                        return customer;
                    }
                }
                return null;
            }
        }

