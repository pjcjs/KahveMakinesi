import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sutDurumu = "", sekerDurumu = "";

        System.out.println("Hangi Kahveyi istersiniz?");
        System.out.println("1.Türk kahvesi");
        System.out.println("2.Filtre Kahve");
        System.out.println("3.Espresso");

        String hangiKahve = sc.nextLine().toLowerCase();

        if (hangiKahve.equalsIgnoreCase("türk kahvesi")) {
            System.out.println(hangiKahve + " hazırlanıyor.");
        } else if (hangiKahve.equalsIgnoreCase("filtre kahve")) {
            System.out.println(hangiKahve + " hazırlanıyor.");
        } else if (hangiKahve.equalsIgnoreCase("espresso")) {
            System.out.println(hangiKahve + " hazırlanıyor.");
        } else {
            System.out.println("Hatalı tuşlama yaptınız.");
            return;
        }

        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
        String sut = sc.nextLine().toLowerCase();

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Süt ekleniyor...");
            sutDurumu = "sütlü";
        } else if (sut.equalsIgnoreCase("hayır")) {
            System.out.println("Süt eklenmiyor");
            sutDurumu = "sütsüz";
        }

        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String seker = sc.nextLine().toLowerCase();

        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = sc.nextInt();
            System.out.println(kacSeker + " şeker ekleniyor.");
            sekerDurumu = kacSeker + " şekerli";
            sc.nextLine(); // Dummy kod
        } else if (seker.equalsIgnoreCase("hayır")) {
            System.out.println("Şeker eklenmiyor");
            sekerDurumu = "şekersiz";
        }

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) : ");
        String boyut = sc.nextLine().toLowerCase();

        if (boyut.equalsIgnoreCase("büyük boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("küçük boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        }

        System.out.println(hangiKahve.substring(0,1).toUpperCase() +hangiKahve.substring(1) +" " + boyut + " " + sutDurumu + " " + sekerDurumu + " hazırdır. Afiyet olsun !!!");

        sc.close();
    }
}