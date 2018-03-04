public class CountElMain {

    public static void main(String[] args) {

        CountedElement<String> name1 = new CountedElement<>("Dave");
        CountedElement<String> name2 = new CountedElement<>("Alison");
        CountedElement<String> name3 = new CountedElement<>("Stew");
        CountedElement<String> name4 = new CountedElement<>("Alison");


        System.out.println(name1.compareTo(name2)); //Should be positive
        System.out.println(name2.compareTo(name4)); //Should be zero
        System.out.println(name4.compareTo(name3)); //Should be negative


        System.out.println("--------------------------");
        CountedElement<Integer> int1 = new CountedElement<>(41);
        CountedElement<Integer> int2 = new CountedElement<>(11);
        CountedElement<Integer> int3 = new CountedElement<>(12);
        CountedElement<Integer> int4 = new CountedElement<>(12);

        System.out.println(int1.compareTo(int2)); //Should be positive
        System.out.println(int2.compareTo(int4)); //Should be negative
        System.out.println(int3.compareTo(int4)); //Should be zero


    }
}
