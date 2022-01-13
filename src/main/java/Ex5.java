import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj przesunięcie strefy czasowej GMT : ");

        int timeZone = in.nextInt();
        long totalMili = System.currentTimeMillis();

        long sekundy = totalMili / 1000;
        long sekundyC = sekundy % 60;
        long minuty = sekundy / 60;
        long minutyC = minuty % 60;
        long godziny = minuty / 60;
        long godzinyC = ((godziny + timeZone) % 24);

        System.out.println("Czas = " + godzinyC + ":" + minutyC + ":" + sekundyC);
    }
}
