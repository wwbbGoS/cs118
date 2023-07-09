import java.util.*;

public class Factorials {
        public static void main(String[] args) {
                Scanner sinput = new Scanner(System.in);
                int a = sinput.nextInt();

                int fact = factorial(a);
                System.out.println(fact);
        }

        private static int factorial(int a) {
        	if (a < 1) {
        		return 0;
        	}

        	int result = 1;

        	while (a > 0) {
        		result = result * a;
        		a--;
        	}

        	return result;
        }

}