import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 6 liczb jednocyfrowych nieujemnych : ");

        int numberOf = 6;
        int number = in.nextInt();

        String str = Integer.toString(number);
        char [] ch = str.toCharArray();

        System.out.println("");

        for(int x = 0; x < numberOf; x++){
            System.out.print(Character.getNumericValue(ch[x]) + " ");
        }
    }
}
