
public class Address {
	
	private int houseNumber;
	private String apartmentNumber;
	private String street;
	private String city;
	private String state;
	private int postcode;
	
	//Constructor with apartment number
	public Address(int houseNumber, String apartmentNumber, String street, String city, String state, int postcode) {
		this.houseNumber = houseNumber;
		this.apartmentNumber = apartmentNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
	}
	
	//Constructor without apartment number
	public Address(int houseNumber, String street, String city, String state, int postcode) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
	}
	
	public void print() {
		if(apartmentNumber != null) {
			System.out.print(apartmentNumber + " ");
			System.out.println(houseNumber + " " + street);
			System.out.println(city + " " + state + " " + postcode);
		} else {
		System.out.println(houseNumber + " " + street);
		System.out.println(city + " " + state + " " + postcode);
		}
	}
	
	public boolean comesBefore(Address other) {
		if(this.postcode < other.postcode) {
			return true;
		} else {
			return false;
		}
	}

}
