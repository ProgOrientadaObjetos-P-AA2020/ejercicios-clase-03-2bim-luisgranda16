
package paquetesiete;

public class Cuadrado extends Figura {
    double lado;
    public Cuadrado(double lad){
        lado = lad;
    }  
    public void establecerLado(double lad){
        lado = lad;
    }
    @Override
    public void calcular_area(){
        area = lado * lado;
    } 
    public double obtenerLado(){
        return lado;
    }
    public double obtenerArea(){
        return area;
    }
    @Override
    public String toString(){ 
        String cadenaFinal = String.format("%s\n", super.toString());
        cadenaFinal = String.format("--Cuadrado--"
                + "%s\n"
                + "Area:: %.2f\n",
                cadenaFinal,
                obtenerArea());
        
        return cadenaFinal;
    }
}
