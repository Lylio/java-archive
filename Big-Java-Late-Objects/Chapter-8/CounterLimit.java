
public class CounterLimit {
	
	private int limit;
	private int count;
	
	
	public void setLimit(int maximum) {
		limit = maximum;
	}
	
	public void count() {
		if(count >= limit) {
			System.out.println("Limit reached (no more admissions): " + limit + " max");
		} else {
		count++;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public int getLimit() {
		return limit;
	}

}
