package Donguler;

import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {
        int right = 3, balance = 1500, select, price;
        String kullaniciAdi = "123", sifre = "123", result;

        while (right > 0) {
            String userName, password;
            Scanner input = new Scanner(System.in);
            System.out.println("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();

            if (userName.equals(kullaniciAdi) && password.equals(sifre)) {
                System.out.println("Bankamıza hoşgeldiniz!");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para Çekme\n" +
                            "2-Para Yatırma\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Çekmek istediğiniz miktar : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz!");
                            } else {
                                balance -= price;
                                System.out.println("Yeni bakiyeniz : " + balance);
                            }
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz miktar : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz : " + balance);
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere iyi günler dileriz.");
                            break;
                        default:
                            System.out.println("Yanlış bir seçim yaptınız. Lütfen tekrar deneyiniz.");
                    }
                }
                while (select != 4);
                break;
            } else {
                System.out.println("Hatalı giriş yaptınız. Kalan deneme hakkınız : " + --right);
            }
            if (right == 0) {
                System.out.println("Kartınız bloke olmuştur.");
            }
        }
    }
}
