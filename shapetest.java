public class ShapeTest {
	public static void main (String[] args) {
		Square s = new Square(4);
		Rectangle r = new Rectangle(5,2);
		Circle c = new Circle(3);
		Oval o = new Oval(2,4);

		System.out.println(s.toString());
		System.out.println(r.toString());
		System.out.println(c.toString());
		System.out.println(o.toString());
	}
}