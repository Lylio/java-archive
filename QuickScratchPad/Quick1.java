public class Quick1 {
    public static void main(String[] args) {

        //What happens if two max values are added?

        double a = Double.MAX_VALUE;

        System.out.println(a + a); //Infinity

        //2nd year Java exam - what's the output?
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        int count = 0;
        for (int i = 0; i <= numbers.length; i++) {
            count += numbers[i];
        }
        System.out.println("Count is " + count); //ArrayIndexOutOfBounds

    }
}
