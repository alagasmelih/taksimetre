import java.util.Scanner;

public class taksimetre {

    public static void main(String[] args) {
        double km, perkm=2.20, total, starterPrice=10;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km olarak giriniz:");
        km = input.nextInt();

        total = starterPrice+  ( km * perkm);
        if ( total<20) {
            int a=20;
            System.out.println("Ödeyeceğiniz tutar: " +a);
        }else {
            System.out.println("Ödeyeceğiniz tutar" +total);
        }

    }
}