public class Ex12 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        System.out.println("Wartość względna                  : " + a + ", " + b);
        System.out.println("Porównanie wartości względnych    : " + Integer.compare(a, b));
        System.out.println("Porównanie wartości bezwzględnych : " + Integer.compareUnsigned(a, b));
    }
}
