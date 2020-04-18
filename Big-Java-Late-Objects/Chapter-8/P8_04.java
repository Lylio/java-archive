
/**
 * P8.4 Implement a class Address. An address has a house number, a street, an optional
 * apartment number, a city, a state, and a postal code. Supply two constructors: one
 * with an apartment number and one without. Supply a print method that prints the
 * address with the street on one line and the city, state, and zip code on the next line.
 * Supply a method public boolean comesBefore(Address other) that tests whether this
 * address comes before another when the addresses are compared by postal code.
 * @author Lyle
 *
 */
public class P8_04 {

	public static void main(String[] args) {
		
		Address home = new Address(22, "Elsie Road", "Glasgow", "Scotland", 386745);
		Address work = new Address(2, "4B", "Pundit Avenue", "Edinburgh", "Scotland", 486753);
		
		home.print();
		
		work.print();
		
	}

}
