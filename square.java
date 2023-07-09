public class Square extends GeometricShape {

	private double length; 

	public Square(double length) {
		this.name = "square";	
		this.length = length;	
	}

    public double getPerimeter() {
    	return length * 4;
    }

    public double getArea() {
    	return length * length;
    }

    public double getLength() {return length;}
}