

public class pointTest {
        public static void main (String[] args) {
                MyPoint p = new MyPoint();
                MyPoint p2 = new MyPoint(10, 20);
                MyPoint p3 = new MyPoint(10, 20);

                System.out.println(p.toString());

                System.out.println(p2.toString());

                System.out.println(p2.getOriginX());

                MyPoint.moveOrigin(2,3);

                System.out.println(p.getOriginX());



        }

}