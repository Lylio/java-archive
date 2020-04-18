
public class VotingMachine {

	private static int democratTotal = 0;
	private static int republicanTotal = 0;
	private String state;
	
	public VotingMachine(String state) {
		this.state = state;
	}
	
	public void voteDemocrat() {
		democratTotal++;
	}
	
	public void voteRepublican() {
		republicanTotal++;
	}
	
	public String getState() {
		System.out.println("State: " + state);
		return state;
	}
	
	public static void getResults() {
		System.out.println("Democrat total: " + democratTotal);
		System.out.println("Republican total: " + republicanTotal);
		if(democratTotal > republicanTotal) {
			System.out.println("DEMOCRATS WIN");
		} else if (republicanTotal > democratTotal) {
			System.out.println("REPUBLICAN WIN");
		} else {System.out.println("TIE ELECTION");}
	}
	
	public static void clearTotals() {
		democratTotal = 0;
		republicanTotal = 0;
	}
	
	
	
}
