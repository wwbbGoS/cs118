public class Circle extends GeometricShape {

	private double radius; 

	public Circle(double radius) {
		this.name = "circle";	
		this.radius = radius;	
	}

    public double getPerimeter() {
    	return 2 * Math.PI * radius;
    }

    public double getArea() {
    	return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getRadius() {
        return radius;
    }

}