import java.util.Scanner;

public class Ex3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int number = in.nextInt();
        int min = 0, max = 1000, wynik = 0;

        if(number > min && number < max + 1){
            System.out.println("Liczba należy do zakresu od " + min + " do " + max);
            String str = Integer.toString(number);

            char [] ch = str.toCharArray();

            for(int i = 0; i < ch.length; i++){
                wynik += Character.getNumericValue(ch[i]);
            }
        }
        else{
            System.out.println("Liczba z poza zakresu od " + min + " do " + max);
        }
        System.out.println("Suma liczb : " + wynik);
    }
}
