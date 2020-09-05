public class ObserverMain {

    public static void main(String[] args) {

        RedDress redDress = new RedDress();
        User sallyJones = new User("Sally Jones");
        redDress.addObserver(new User("Beth Morrison"));
        redDress.addObserver(new User("Gail Parson"));
        redDress.addObserver(new User("Fiona Gray"));

        redDress.setAvailable(false);
        redDress.setAvailable(true);

    }
}
