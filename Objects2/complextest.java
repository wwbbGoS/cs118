import java.util.*;

public class ComplexTest {
    public static void main(String args[]){
        ComplexNumber c1 = new ComplexNumber(2,4);

        System.out.println("c1 is: " + c1.toString());

        System.out.println("c1's absolute value is: " + c1.getAbsoluteValue());

        ComplexNumber c2 = new ComplexNumber(3,5);

        System.out.println("c2 is: " + c2.toString());

        System.out.println("c2's absolute value is: " + c2.getAbsoluteValue());

        System.out.println("Addition between c1 and c2: " + ComplexNumber.add(c1, c2).toString());
        System.out.println("Subtraction between c1 and c2: " + ComplexNumber.subtract(c1, c2).toString());
        System.out.println("Multiplication between c1 and c2: " + ComplexNumber.multiply(c1, c2).toString());
        System.out.println("Division between c1 and c2: " + ComplexNumber.divide(c1, c2).toString());
    
    }
}