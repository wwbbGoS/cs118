public class Test {
        public static void main (String[] args) {
                double[] randomNums = new double[1000];
                double total = 0;

                for (int i = 0; i < 1000; i++) {
                        randomNums[i] = Math.random();
                        System.out.println(randomNums[i]);
                        total = total + randomNums[i];
                }

                System.out.println("Average is: " + (total/1000.0));

        }


}