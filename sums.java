import java.util.*;

public class Sums {
        public static void main(String[] args) {
                Scanner sinput = new Scanner(System.in);
                int a = sinput.nextInt();
                int b = sinput.nextInt();
                int sum = sumBetween(a, b);
                System.out.println(sum);
        }

        public static int sumBetween(int c, int d){

                int result = 0;

                int start = 0;
                int end = 0;

                if (c > d) {
                        start = d;
                        end = c;
                }
                else {
                        start = c;
                        end = d;
                }

                for (int i = start+1; i < end; i++){
                        result = result + i;
                }

                return result;
        }

}