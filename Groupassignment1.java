package groupass1;

import java.util.ArrayList;
public class Groupassignment1 {

  
    
    public static void main(String[] args) {
        ArrayList<GeometricShape> Shapes = new ArrayList<>();
        
        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(5.0,10.0);
        Cone cone = new Cone(5.0,10.0);
        
        Shapes.add(sphere);
        Shapes.add(cylinder);
        Shapes.add(cone);
        
        for(GeometricShape shape : Shapes){
            System.out.printf("%s Volume: %.4f\n",shape.toString(),shape.calculateVolume());
            System.out.printf("%s Surface Area: %.4f\n",shape.toString(),shape.calculateSurfaceArea());
        }
    }
}

class Sphere implements GeometricShape{

private double radius;

    public Sphere() {
    }

    public Sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateVolume(){
        double volume = (4.0/3.0)* Math.PI * Math.pow(radius, 3);
        return volume;
    }
    
    @Override
    public double calculateSurfaceArea(){
        double area = 4 * Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    @Override
    public String toString(){
        return "Sphere";
    }
    
}

class Cylinder implements GeometricShape {

    private double r; //radius
    private double h; //height
    private double V; //volume
    private double A; //surface area

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getV() {
        return V;
    }

    public double getA() {
        return A;
    }

    @Override
    public double calculateVolume() {
        double volume = Math.PI * Math.pow(r, 2) * h;
        this.V = volume;
        return volume;
    }

    @Override
    public double calculateSurfaceArea() {
        double area = 2 * Math.PI * Math.pow(r, 2) + 2 *Math.PI * r * h;
        this.A = area;
        return area;
    }
    
    @Override
    public String toString(){
        return "Cylinder";
    }
}

class Cone implements GeometricShape {

    private double radius;
    private double height;
    
    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public void setRadius(double radius){
        this.radius =radius;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public double calculateVolume(){
        return Math.PI*Math.pow(radius,2)*height/3  ;
    }
    
    @Override
    public double calculateSurfaceArea(){
        double bracket = radius + Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
        return Math.PI*radius*bracket;
    }
    
    @Override
    public String toString(){
        return "Cone";
    }
}