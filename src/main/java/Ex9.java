import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę : ");
        int a = in.nextInt();
        System.out.println("Podaj 2 liczbę : ");
        int b = in.nextInt();

        int suma = a + b;
        int diff = a - b;
        int iloczyn = a * b;
        int iloraz = a / b;
        int srednia = (a + b) / 2;
        int max = 0;
        int min = 0;
        int dystans = Math.max(a, b) - Math.min(a,b);

        if(Math.max(a,b) == a){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }

        System.out.println("\n\n\nWyniki : ");
        System.out.println("Suma     : " + suma);
        System.out.println("Różnica  : " + diff);
        System.out.println("Iloczyn  : " + iloczyn);
        System.out.println("Iloraz   : " + iloraz);
        System.out.println("Średnia  : " + srednia);
        System.out.println("Dystans  : " + dystans);
        System.out.println("Większa  : " + max);
        System.out.println("Mniejsza : " + min);
    }
}
