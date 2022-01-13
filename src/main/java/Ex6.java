import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> skala = new ArrayList<>();

        System.out.println("Kalkulator BMI");

        skala.add(0.0);//wygłodzenie
        skala.add(15.99);
        skala.add(16.00);//wychudzenie
        skala.add(16.99);
        skala.add(17.00);//niedowaga
        skala.add(18.49);
        skala.add(18.5);//wartość prawidłowa
        skala.add(24.99);
        skala.add(25.0);//nadwaga
        skala.add(29.99);
        skala.add(30.0);//1stopien otyłości
        skala.add(34.99);
        skala.add(35.0);//2stopien otyłości
        skala.add(39.99);

        System.out.println("Podaj swoją wagę w kg : ");
        double waga = in.nextDouble();
        System.out.println("Podaj swój wzrost w cm : ");
        double wzrost = in.nextDouble();

        System.out.println("\n\n\nObliczanie wyników : ");

        wzrost /= 100;

        double wynik = waga / ((wzrost * wzrost));

        wzrost *= 100;

        System.out.println("Wynik : ");

        if(wynik > skala.get(0) && wynik < skala.get(1)){
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "wygłodzenie");
        }
        else if(wynik > skala.get(2) && wynik < skala.get(3)){
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "wychudzenie");
        }
        else if(wynik > skala.get(4) && wynik < skala.get(5)){
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "niedowaga");
        }
        else if(wynik > skala.get(6) && wynik < skala.get(7)){
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "prawidłowa waga");
        }
        else if(wynik > skala.get(8) && wynik < skala.get(9)){
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "nadwaga");
        }
        else if(wynik > skala.get(10) && wynik < skala.get(11)){
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "1 stopień otyłości");
        }
        else if(wynik > skala.get(12) && wynik < skala.get(13)){
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "2 stopień otyłości");
        }
        else{
            System.out.println("Twoja waga : " + waga + "\nTwój wzrost w cm : " + wzrost + "\nTwoje BMI : " + wynik + "\nMasz : " + "skrajną otyłość");
        }
    }
}
