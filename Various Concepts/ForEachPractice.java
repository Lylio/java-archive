import java.util.ArrayList;

public class ForEachPractice {

	public static void main(String[] args) {
		
		int[] numberList = {43, 45, 12, 8, 50, 32};
		
		for(int i : numberList) {
			System.out.println(i);
		}
		
		String[] wordList = {"brakes", "wheels", "windows", "seats", "engine"};
		
		for(String word : wordList) {
			System.out.println(word);
		}
		
		daysOfWeek();
		
		

	}
	
	public static void daysOfWeek() {
		ArrayList<String> days = new ArrayList<String>();
		days.add("Monday");days.add("Tuesday");days.add("Wednesday");
		days.add("Thursday");days.add("Friday");days.add("Saturday");days.add("Sunday");
		
		for(String day : days) {
			System.out.println(day);
		}
		
	}

}
