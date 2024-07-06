import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        float n1, n2;
        int secim;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        n1 = input.nextFloat();

        System.out.print("2. sayıyı giriniz: ");
        n2 = input.nextFloat();

        System.out.println("Seçim Yapınız:\n 1-) Toplama \n 2-) Cikarma\n 3-) Bolme \n 4-) Carpma ");

        System.out.print("seciminiz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                float toplam = n1 + n2;
                System.out.print("sonuc: " + toplam);
                break;
            case 2:
                float fark = n1 - n2;
                System.out.print("sonuc: " + fark);
                break;
            case 3:
                float bolum;
                if (n2 != 0) {
                    bolum = n1 / n2;
                    System.out.println("sonuc: " + bolum);
                } else {
                    System.out.println("bir sayi 0 a bolunemez!!!");
                }
                break;
            case 4:
                float carpim = n1*n2;
                System.out.println("sonuc: " +carpim);
                break;

        }


    }
}