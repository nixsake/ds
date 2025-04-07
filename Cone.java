/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupass1;

/**
 *
 * @author user
 */
public class Cone {

    private double radius;
    private double height;
    
    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public double calculateVolume(){
        return Math.PI*Math.pow(radius,2)*height/3  ;
    }
    
    public double calculateSurfaceArea(){
        double bracket = radius + Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
        return Math.PI*radius*bracket;
    }
    
    public static void main(String[] args) {
        Cone a = new Cone(5,10);
        System.out.println("Volume: "+a.calculateVolume() );
        System.out.println("Surface Area: "+ a.calculateSurfaceArea());
    }
}
