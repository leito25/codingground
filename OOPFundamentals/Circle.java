//Class name Circulo
public class Circle
{
    //class properties - privadas//
    private double radius = 1.0;
    private String color = "blue";
    
    //class methods
    /*
    double getRadius(){}
    double getArea(){}
    */
    
    //Método constructoor por default(radio y color)
    public Circle(){
        radius = 1.0;
        color = "blue";
    }
    
    public Circle(double r){
        radius = r;
        color = "blue" //solo el radio es variable
                        //el color va por defecto
    }                    
                        
    //método para capturar el radio
    public double getRadius(){
        return radius;
    }
    
    //método para calcular el area
    public double getArea(){
        return radius*radius*Math.PI;
    }
                        
}