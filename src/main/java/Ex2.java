import java.util.Scanner;

public class Ex2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę (inch) : ");
        int inch = in.nextInt();
        float multiplier = 0.0254f;
        float meter = inch * multiplier;

        System.out.println("Długość w metrach : " + meter);
    }
}
