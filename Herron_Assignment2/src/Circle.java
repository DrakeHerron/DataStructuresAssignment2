public class Circle {
    Point center;
    double radius;

    public Circle(){
        this.center = new Point();
        this.radius = 1;
    }

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { return center; }
    public double getRadius() { return radius; }

    public double computeSurface() {
        double surface = 0;
        //π · r2
        surface = (this.radius) * (this.radius) * 3.14;
        return surface;
    }

    public double computeCircumference(){
        double circumference = 0;
        //2 · π · r
        circumference = (this.radius) * 3.14 * 2;
        return circumference;
    }
}
