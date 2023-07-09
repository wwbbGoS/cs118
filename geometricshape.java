public abstract class GeometricShape {
        protected String name;

        public String toString() {
                return ("This is a " + name + " with a perimeter of " + getPerimeter() + " and an area of " + getArea());
        }

        public String getName() { return name;}
        
        public abstract double getPerimeter();

        public abstract double getArea();
}