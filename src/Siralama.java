import java.util.Scanner;

public class Siralama {

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("3.Sayıyı Giriniz: ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Büyükten küçüğe sıralama: " + a + " > " + b + " > " + c);
            } else {
                System.out.println("Büyükten küçüğe sıralama: " + a + " > " + c + " > " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Büyükten küçüğe sıralama: " + b + " > " + a + " > " + c);
            } else {
                System.out.println("Büyükten küçüğe sıralama: " + b + " > " + c + " > " + a);
            }
        } else {
            if (a > b) {
                System.out.println("Büyükten küçüğe sıralama: " + c + " > " + a + " > " + b);
            } else {
                System.out.println("Büyükten küçüğe sıralama: " + c + " > " + b + " > " + a);
            }
        }
    }
}
