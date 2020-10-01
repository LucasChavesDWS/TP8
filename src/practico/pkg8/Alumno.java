
package practico.pkg8;

import java.util.HashMap;
import java.util.Map;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    Map <Integer, Materia> Materias = new HashMap<>();
    
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public void agregarMateria (Materia m){
        if(Materias.containsKey(m.getIdMateria()))
            System.out.println("El alumno"+ apellido +" ya esta inscripto en tal materia");
        else
            Materias.put(m.getIdMateria(), m);
    }
    
    public int cantidadMaterias(){
        return Materias.size();
    }
}
