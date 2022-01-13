import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Input Farenheit degrees : ");

        Scanner in = new Scanner(System.in);

        int far = in.nextInt(), wynik = 0, mnoznik = 0;
        wynik = (5 * (far - 32)) / 9;

        System.out.println("Celcius degrees : " + wynik);
    }
}
