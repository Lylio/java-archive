import java.util.Scanner;

/**
 * P3.10 The boiling point of water drops by about one degree centigrade for every 300
 * meters (or 1,000 feet) of altitude. Improve the program of Exercise P3.9 to allow the
 * user to supply the altitude in meters or feet.
 * @author Lyle
 *
 */
public class P3_10 {
	 //NEEDS REDONE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int CEL_FREEZE = 0;
		final int CEL_BOIL = 100;
		final int FAR_FREEZE = 32;
		final int FAR_BOIL = 212;
		int CEL_BOIL_NEW = 0;
		int FAR_BOIL_NEW = 0;
		
		System.out.print("Please enter temperature: ");
		double temperature = in.nextDouble();
		System.out.println("Celsuis or Farenheit? C/F: ");
		String scale = in.next();
		scale = scale.toUpperCase();
		System.out.println("Please enter altitude: ");
		int altitude = in.nextInt();
		System.out.println("Please enter feet or metres F/M: ");
		String altScale = in.next();
		altScale = altScale.toUpperCase();
		
		if(altScale.equals("F")) {
			CEL_BOIL_NEW = CEL_BOIL;
			CEL_BOIL_NEW = CEL_BOIL_NEW - (altitude / 1000); //Boiling point of water drops by one degree centigrade for every 1000ft
			FAR_BOIL_NEW = FAR_BOIL;		
			FAR_BOIL_NEW = FAR_BOIL_NEW - (altitude / 1000) * 2; //Boiling point of water drops by two degrees farenheit for every 1000ft
		} else {
			CEL_BOIL_NEW = CEL_BOIL;
			CEL_BOIL_NEW = CEL_BOIL_NEW - (altitude / 300);
			FAR_BOIL_NEW = FAR_BOIL;
			FAR_BOIL_NEW = FAR_BOIL_NEW - (altitude / 300) * 2;
		}
		
		if(scale.equals("C")) {
			if(temperature <= CEL_FREEZE) {
				System.out.println("Solid");
			} else if(temperature > CEL_FREEZE && temperature < CEL_BOIL_NEW) {
				System.out.println("Liquid");
			} else {System.out.println("Gas");}
		} else {
			if(temperature <= FAR_FREEZE) {
				System.out.println("Solid");
			} else if(temperature > FAR_FREEZE && temperature < FAR_BOIL_NEW) {
				System.out.println("Liquid");
			} else {System.out.println("Gas");}
		}
	in.close();

	}

}
