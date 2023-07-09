public class Oval extends GeometricShape {

	private double majorRadius;
    private double minorRadius; 

	public Oval(double majorRadius, double minorRadius) {
		this.name = "oval";	
		this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;	
	}

    public double getPerimeter() {

        double c = Math.sqrt((((2*majorRadius) * (2*majorRadius)) + ((2*minorRadius) * (2*minorRadius)))/2);
    	return 2 * Math.PI * c;
    }

    public double getArea() {
    	return Math.PI * minorRadius * majorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

}