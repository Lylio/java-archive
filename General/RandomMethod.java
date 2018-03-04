import java.util.Random;
public class RandomMethod {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		System.out.println(random.nextInt(10) + 1); //Random number from 1 - 10 (High - low + 1) + low
		System.out.println(random.nextInt(5));
		
		
	}

}
