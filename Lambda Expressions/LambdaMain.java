public class LambdaMain {
    public static void main(String[] args) {

        Greeting myLamdaGreeting = () -> System.out.println("Mmmm, yummy Lambda!");

        myLamdaGreeting.perform();

        LambdaAdd myLambdaAdd = (int a, int b) -> {
            System.out.println(a + b);
            return a + b;
        };

        myLambdaAdd.add(6, 9);

    }
}
