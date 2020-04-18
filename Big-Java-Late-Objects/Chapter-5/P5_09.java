import java.util.Scanner;

 /**
  * P5.9 Write methods
  * public static double sphereVolume(double r)
  * public static double sphereSurface(double r)
  * public static double cylinderVolume(double r, double h)
  * public static double cylinderSurface(double r, double h)
  * public static double coneVolume(double r, double h)
  * public static double coneSurface(double r, double h)
  * that compute the volume and surface area of a sphere with radius r, a cylinder with a
  * circular base with radius r and height h, and a cone with a circular base with radius r
  * and height h. Then write a program that prompts the user for the values of r and h,
  * calls the six methods, and prints the results.
 * @author Lyle
 *
 */
public class P5_09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter radius: ");
		double r = in.nextDouble();
		System.out.println("Please enter height: ");
		double h = in.nextDouble();
		in.close();
		
		System.out.println(cylinderVolume(r, h));
		

	}
	
	public static double sphereVolume(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    public static double sphereSurface(double r) {
        return 4 * Math.PI * r * r;
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    public static double coneVolume(double r, double h) {
        return (1.0 / 3.0) * Math.PI * r * r * h;
    }

    public static double coneSurface(double r, double h) {
        double l = Math.sqrt(r * r + h * h);

        return Math.PI * r * (r + l);
    }

}
