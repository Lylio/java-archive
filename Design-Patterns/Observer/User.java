public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sendInStockMsg() {
        System.out.println("Hi, " + name + ", the Red Dress is now available.");
    }

    public void sendOutOfStockMsg() {
        System.out.println("Hi, " + name + ", the Red Dress is unfortunately out of stock just now.");
    }
}
