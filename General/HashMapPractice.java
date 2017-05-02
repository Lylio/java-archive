import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Monday");
		map.put(2, "Tuesday");
		map.put(3, "Wednesday");
		map.put(4, "Thursday");
		map.put(5, "Friday");
		map.put(6, "Saturday");
		map.put(7, "Sunday");
		
		System.out.println(map.get(4));
		
		System.out.println(map.keySet());
		
		map.remove(1);
		
		System.out.println(map.keySet());
		
		int num = 7;
		System.out.println(map.get(num));
		

	}
	
	

}
