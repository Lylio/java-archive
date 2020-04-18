
public class SodaCan {
	
	private double height;
	private double radius;
	
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea() { 
	    return 2 * Math.PI * radius * (radius + height);
	   
	}
	
	public double getVolume() {
	    return Math.PI * radius * radius * height;
	}

}
