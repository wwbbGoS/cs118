public class Rectangle extends GeometricShape {

	private double length;
    private double width;

	public Rectangle(double length, double width) {
		this.name = "rectangle";	
		this.length = length;	
        this.width = width;
	}

    public double getPerimeter() {
    	return ((length * 2) + (width * 2));
    }

    public double getArea() {
    	return length * width;
    }

    public double getLength() {return length;}

    public double getWidth() {return width;}

}