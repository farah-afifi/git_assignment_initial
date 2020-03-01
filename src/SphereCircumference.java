public class SphereCircumference implements ISubscriber{
	private double getSphereCircumference(double r) {
		double area=2*Math.PI*r;
		return area;
	}
	@Override
	public void notifySubscriber(String input) {
		double r;
		try {
			r=Double.parseDouble(input);
		} catch (Exception e) {
			System.out.println("enter a real number");
			return;
		}
		
		if(r<0) {
			System.out.println("r must be >= 0");
			return;
		}
		System.out.println("Area= "+getSphereCircumference(r));
		
	}

}
