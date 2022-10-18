public class Cylinder {
    Circle base;
    double height;
    double radius;

    public Cylinder(){
        this.base = new Circle();
        this.height = 1;
        this.radius = this.base.getRadius();
    }

    public Cylinder(Circle base, double height){
        this.base = base;
        this.height = height;
        this.radius = this.base.getRadius();
    }

    public Circle getBase() { return base; }
    public double getHeight() { return height; }

    public double computeSurface(){
        double surface = 0;
        //2 · π · r · (r + h)
        surface = 2 * 3.14 * this.radius * (this.radius * this.height);
        return surface;
    }

    public double computeVolume(){
        double volume = 0;
        //π · r2 · h
        volume = 3.14 * this.radius * this.radius * this.height;
        return volume;
    }
}
