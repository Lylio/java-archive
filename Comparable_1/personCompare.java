package Comparable_1;

public class personCompare {

	public static void main(String[] args) {

		Person steve = new Person("Steve", 48);
		Person alfie = new Person("Alfie", 51);

		int compareValue = steve.compareTo(alfie);

		//Expected that Alfie is older
		switch(compareValue) {
		case -1: {
			System.out.println("Alfie is older!");
			break;
		} case 0: {
			System.out.println("They are the same age!");
			break;
		} case 1: {
			System.out.println("Steve is older");
		}


		}

	}

}
