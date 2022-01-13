import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj długość boku");

        int a = in.nextInt();
        int pole = a*a;
        int obj = (int) Math.pow(a, 3);
        int four = (int) Math.pow(a, 4);

        System.out.println("\n\nWyniki : ");
        System.out.println("Pole : " + pole);
        System.out.println("Objętość : " + obj);
        System.out.println("Czwarta Potęga : " + four);
    }
}
