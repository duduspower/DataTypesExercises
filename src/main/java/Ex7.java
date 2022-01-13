import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj dystans (w metrach) : ");
        int m = in.nextInt();

        System.out.println("\nPodaj czas : ");
        System.out.println("Podaj ilość godzin : ");
        int h = in.nextInt();
        System.out.println("Podaj ilość minut : ");
        int min = in.nextInt();
        System.out.println("Podaj ilość sekund : ");
        int s = in.nextInt();

        double km = m / 1000;
        double mi = km * 0.621371192;

        long czasWsekundach = (h * 60 * 60L) + (min * 60L) + s;
        double czasWgodzinach = h + (double)min / 60 + (double)s / 60 / 60;

        System.out.println("\nDystans w : ");
        System.out.println("Metrach : " + m);
        System.out.println("Kilometrach : " + km);
        System.out.println("Milach : " + mi);

        double wynikMetry   = (double) m / czasWsekundach;
        double wynikKiloM   = km / czasWgodzinach;
        double wynikMile    = mi / czasWgodzinach;

        System.out.println("Twoja prędkość w metrach na sekundę : " + wynikMetry + "\nTwoja prędkosć w kilometrach na godzinę : " + wynikKiloM + "\nTwoja prędkość w milach na godzinę : " + wynikMile);
    }
}
