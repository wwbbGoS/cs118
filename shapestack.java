public class ShapeStack implements MyStack {
	private GeometricShape[] stack;
	private int count;

	public ShapeStack() {
		stack = new GeometricShape[10];
		count = 0;
	}

	public ShapeStack(int length) {
		stack = new GeometricShape[length];
		count = 0;
	}

	public void push(Object o) {
		if (o instanceof GeometricShape) {
			if (count == stack.length) {
				GeometricShape[] newStack = new GeometricShape[stack.length + 100];
				System.arraycopy(stack, 0, newStack, 0, stack.length);
				stack = newStack;
			}
			stack[count] = (GeometricShape)o;
			count++;
		}
		else {
			System.err.println("THAT IS NOT A SHAPE");
		}
	}

	public Object pop() {
		count--;
		return stack[count];
	}

	public int getLength() { return count;}
}