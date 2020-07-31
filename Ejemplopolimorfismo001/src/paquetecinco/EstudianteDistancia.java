
package paquetecinco;

public class EstudianteDistancia extends Estudiante {
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
    */ 
    
    int numeroAsignaturas;
    double costoAsignatura;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularMatricula(){
        matricula = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }
    public double obtenerMatriculaDistancia(){
        return matricula;
    }
    @Override
     public String toString(){ 
        String cadenaFinal = String.format("%s\n", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Numero Asignaturas: %.2f\n"
                + "Costo Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                obtenerNumeroAsignaturas(),
                obtenerCostoAsignatura(),
                obtenerMatriculaDistancia());
        
        return cadenaFinal;
    }
        
}
