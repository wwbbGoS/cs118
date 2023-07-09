public class MyPoint{
        private int x;
        private int y;
        private static int xOrigin = 0;
        private static int yOrigin = 0;

        public MyPoint(){
                this.x = 0;
                this.y = 0;
        }

        public MyPoint(int x, int y) {
                this.x = x;
                this.y = y;
        }

        public MyPoint(MyPoint p) {
                this.x = p.getX();
                this.y = p.getY();
        }

        public int getOriginX(){
                return xOrigin;
        }

        public int getOriginY(){
                return yOrigin;
        }

        public static void moveOrigin(int x, int y){
                yOrigin = y;
                xOrigin = x;
        }

        public int getX() {
                return x;
        }

        public int getY() {
                return y;
        }

        public void setLocation(int x, int y){
                this.x = x;
                this.y = y;
        }

        public void move(int x, int y){
                this.x = this.x + x;
                this.y = this.y + y;
        }

        public String toString(){
                return ("(" + x + "," + y + ")");
        }

        public boolean equals(MyPoint p) {
                return this.x == p.getX() && this.y == p.getY();
        }





}