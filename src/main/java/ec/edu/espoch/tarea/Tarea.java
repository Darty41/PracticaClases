
package ec.edu.espoch.tarea;

public class Tarea {

    public static void main(String[] args) {
        //crea el objeto "estudianteUno"
        estudiante estudianteUno= new estudiante();
        //asigna valores a las variables
        estudianteUno.Nombre="hola";
        estudianteUno.identificacion="225002828";
        estudianteUno.calificacionesPromedios=9.99;
        
        //se imprime los datos
        System.out.println("Nombre: " + estudianteUno.Nombre);
        System.out.println("Identificacion: "+ estudianteUno.identificacion);
        System.out.println("calificacion: "+estudianteUno.calificacionesPromedios);
        
        //crea el objeto "estudianteUno"
        estudiante estudianteDos= new estudiante();
        //asigna valores a las variables
        estudianteDos.Nombre="Sonia";
        estudianteDos.identificacion = "2250180979";
        estudianteDos.calificacionesPromedios=7;
        
        //se imprime los datos
        System.out.println("Nombre: " + estudianteDos.Nombre);
        System.out.println("Identificacion: "+ estudianteDos.identificacion);
        System.out.println("calificacion: "+estudianteDos.calificacionesPromedios);
    }
}
