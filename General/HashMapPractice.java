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
		
		System.out.println(map.get(3));
		
		System.out.println(map.keySet());

		String s = map.get(8);

		System.out.println(map.containsValue("Friday"));

		System.out.println(map.get(3) + s);

	}
	
	

}
