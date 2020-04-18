
/**
 * P8.10 Implement a VotingMachine class that can be used for a simple election. Have methods
 * to clear the machine state, to vote for a Democrat, to vote for a Republican, and to
 * get the tallies for both parties.
 * @author Lyle
 *
 */
public class P8_10 {

	public static void main(String[] args) {
		
		VotingMachine utah = new VotingMachine("Utah");
		utah.voteDemocrat(); utah.voteDemocrat(); utah.voteDemocrat();
		utah.voteRepublican();utah.voteRepublican(); utah.voteDemocrat();utah.voteDemocrat();
		
		VotingMachine california = new VotingMachine("California");
		california.voteRepublican(); california.voteRepublican(); california.voteRepublican();
		california.voteDemocrat(); california.voteDemocrat(); california.voteDemocrat(); california.voteDemocrat();
		california.voteDemocrat();
		
		VotingMachine alabama = new VotingMachine("Alabama");
		alabama.voteRepublican(); alabama.voteRepublican(); alabama.voteRepublican(); alabama.voteRepublican();
		alabama.voteRepublican(); alabama.voteRepublican(); alabama.voteDemocrat(); alabama.voteDemocrat(); alabama.voteDemocrat();
		
		VotingMachine.getResults();
		VotingMachine.clearTotals();
		
	}

}
