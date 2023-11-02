package java101;
import java.util.Scanner;

public class EbobEkokHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        scanner.close();

        int ebob = 1;
        int ekok = (sayi1 * sayi2);

        // EBOB hesaplama
        int min = Math.min(sayi1, sayi2);
        int i = 2;
        while (i <= min) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK hesaplama
        int max = Math.max(sayi1, sayi2);
        i = 2;
        while (i <= (sayi1 * sayi2)) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("EBOB(" + sayi1 + ", " + sayi2 + ") = " + ebob);
        System.out.println("EKOK(" + sayi1 + ", " + sayi2 + ") = " + ekok);
    }
}
