import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę minut : ");

        double minutes = in.nextInt();
        double minInYear = 60 * 24 * 365;

        int years = (int) (minutes / minInYear);
        int days = (int) (minutes / 60 / 24) % 365;

        System.out.println("Podane minuty : " + (int) minutes + " lata : " + years + " dni : " + days);
    }
}
