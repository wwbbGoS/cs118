public class StackTest {
	public static void main (String args[]) {
		ShapeStack sStack = new ShapeStack();

		sStack.push(new Square(4));
		sStack.push(new Rectangle(2,3));
		sStack.push(new Circle(3));
		sStack.push(new Oval(1,5));

		while (sStack.getLength() != 0) {
			GeometricShape currShape = (GeometricShape)sStack.pop();
			System.out.println(currShape.toString());
		}

	}
}