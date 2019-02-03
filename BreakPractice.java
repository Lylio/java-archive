
public class BreakPractice {

	public static void main(String[] args) {
		
		break1();

	}
	
	public static void break1() {
		for(int i = 0; i < 100; i++) {
			System.out.print(i + " ");
			if(i == 24) {
				System.out.println("\nBreak at " + i);
				break;
			}
		}
	}

}
