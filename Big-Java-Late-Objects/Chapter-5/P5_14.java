import java.util.HashMap;
import java.util.Map;

/**P5.14 Write a method String getTimeName(int hours, int minutes) that returns the English
  * name for a point in time, such as "ten minutes past two", "half past three", "a quarter to
  * four", or "five o'clock". Assume that hours is between 1 and 12.
 * @author Lyle
 *
 */
public class P5_14 {

	public static void main(String[] args) {

		getTimeName(12, 38);
		
		
	}
	
	public static String getTimeName(int hours, int minutes) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one"); map.put(2, "two"); map.put(3, "three");
		map.put(4, "four"); map.put(5, "five"); map.put(6, "six");
		map.put(7, "seven"); map.put(8, "eight"); map.put(9, "nine");
		map.put(10, "ten"); map.put(11, "eleven"); map.put(12, "twelve");
		
		String time = "";
		
		//Time if approximately on the hour

		if (minutes == 57 || minutes == 58 || minutes == 59 || minutes == 0 || minutes == 1 || minutes == 2) {
			if (hours == 12 && (minutes == 57 || minutes == 58 || minutes == 59)) {
				time = map.get(1) + " o'clock";
				System.out.println(time);
				return time;
			} else if (hours == 12 && (minutes == 0 || minutes == 1 || minutes == 2)) {
				time = map.get(hours) + " o'clock";
				System.out.println(time);
				return time;
			}

			else {
				time = map.get(hours) + " o'clock";
				System.out.println(time);
				return time;
			}
		}

		// Time if approximately five past the hour
		else if (minutes == 3 || minutes == 4 || minutes == 5 || minutes == 6) {
			time = "Five past " + map.get(hours);
			System.out.println(time);
			return time;
		}

		// Time if approximately ten past the hour
		else if (minutes == 7 || minutes == 8 || minutes == 9 || minutes == 10 || minutes == 11 || minutes == 12) {
			time = "Ten past " + map.get(hours);
			System.out.println(time);
			return time;
		}

		// Time if approximately quarter past the hour
		else if (minutes == 13 || minutes == 14 || minutes == 15 || minutes == 16) {
			time = "Quarter past " + map.get(hours);
			System.out.println(time);
			return time;
		}

		// Time if approximately twenty past the hour
		else if (minutes == 17 || minutes == 18 || minutes == 19 || minutes == 20 || minutes == 21 || minutes == 22) {
			time = "Twenty past " + map.get(hours);
			System.out.println(time);
			return time;
		}

		// Time if approximately twenty-five past the hour
		else if (minutes == 23 || minutes == 24 || minutes == 25 || minutes == 26) {
			time = "Twenty-five past " + map.get(hours);
			System.out.println(time);
			return time;
		}

		// Time if approximately half past the hour
		else if (minutes == 27 || minutes == 28 || minutes == 29 || minutes == 30 || minutes == 31 || minutes == 32) {
			time = "Half past " + map.get(hours);
			System.out.println(time);
			return time;
		}

		// Time if approximately twenty-five to the hour
		else if (minutes == 33 || minutes == 34 || minutes == 35 || minutes == 36) {
			if (hours == 12) {
				time = "Twenty-five to " + map.get(1);
				System.out.println(time);
				return time;
			} else {
				time = "Twenty-five to " + map.get(hours + 1);
				System.out.println(time);
				return time;
			}

		}

		// Time if approximately twenty to the hour
		else if (minutes == 37 || minutes == 38 || minutes == 39 || minutes == 40 || minutes == 41 || minutes == 42) {
			if (hours == 12) {
				time = "Twenty to " + map.get(1);
				System.out.println(time);
				return time;
			} else {
				time = "Twenty to " + map.get(hours + 1);
				System.out.println(time);
				return time;
			}

		}

		// Time if approximately quarter to the hour
		else if (minutes == 43 || minutes == 44 || minutes == 45 || minutes == 46) {
			if (hours == 12) {
				time = "Quarter to " + map.get(1);
				System.out.println(time);
				return time;
			} else {
				time = "Quarter to " + map.get(hours + 1);
				System.out.println(time);
				return time;
			}

		}

		// Time if approximately ten to the hour
		else if (minutes == 47 || minutes == 48 || minutes == 49 || minutes == 50 || minutes == 51 || minutes == 52) {
			if (hours == 12) {
				time = "Ten to " + map.get(1);
				System.out.println(time);
				return time;
			} else {
				time = "Ten to " + map.get(hours + 1);
				System.out.println(time);
				return time;
			}

		}

		// Time if approximately five to the hour
		else if (minutes == 53 || minutes == 54 || minutes == 55 || minutes == 56) {
			if (hours == 12) {
				time = "Five to " + map.get(1);
				System.out.println(time);
				return time;
			} else {
				time = "Five to " + map.get(hours + 1);
				System.out.println(time);
				return time;
			}

		}
		
		return time;
	}

}
