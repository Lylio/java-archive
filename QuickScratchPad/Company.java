public class Company {

    private static final Company instance = new Company();

    private Company() {}

    public Company getInstance() {
        return instance;
    }
}
