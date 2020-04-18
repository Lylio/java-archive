/*import java.util.Scanner;

*//**Add error handling to Exercise P3.10. If the user does not enter a number when
expected, or provides an invalid unit for the altitude, print an error message and end
the program.
 * @author Lyle
 *
 *//*
public class P3_11 {
	 //NEEDS REDONE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int CEL_FREEZE = 0;
		final int CEL_BOIL = 100;
		final int FAR_FREEZE = 32;
		final int FAR_BOIL = 212;
		int CEL_BOIL_NEW = 0;
		int FAR_BOIL_NEW = 0;
		int altitude = 0;
		double temperature = 0;
		String scale = "";
		String altScale = "";
		boolean sentinel = false;
		
		
		
		System.out.print("Please enter temperature: ");
		while (!sentinel) {
		temperature = in.nextDouble();
		if(temperature != in.hasNextDouble()) {
			
		}
			
		}
		
		System.out.println("Celsuis or Farenheit? C/F: ");
		while (!sentinel) {
		if(in.next().equals("F") || in.next().equals("C") || in.next().equals("f") 
				|| in.next().equals("c")) {
			scale = in.next();
			scale = scale.toUpperCase();
		} else {
			System.out.println("Error - incorrect entry");
			sentinel = true;
			break;
			}
		
		}
		
		
		while(!sentinel) {
		System.out.println("Please enter altitude: ");
		if(in.hasNextInt()) {
		altitude = in.nextInt();
		} else {
			System.out.println("Error - not a number");
			sentinel = true;
			break;
			}
		
		}
		
		System.out.println("Please enter feet or metres F/M: ");
		altScale = in.next();
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


*/