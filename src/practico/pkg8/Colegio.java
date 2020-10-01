
package practico.pkg8;


public class Colegio {

    public static void main(String[] args) {
       
        Materia ingles = new Materia (1000,"Ingles I",1);
        Materia matematicas = new Materia (1001,"Matematicas",1);
        Materia laboratorio = new Materia (1002,"Laboratorio I",1);
        
        Alumno lp = new Alumno (1001,"Lopez","Martin");
        Alumno mb = new Alumno (1002,"Martinez","Brenda");
        
        lp.agregarMateria(ingles);
        lp.agregarMateria(matematicas);
        lp.agregarMateria(laboratorio);
        
        mb.agregarMateria(ingles);
        mb.agregarMateria(matematicas);
        mb.agregarMateria(laboratorio);
        mb.agregarMateria(laboratorio);
        
        System.out.println("Cantidad de materias de Lopez: " + lp.cantidadMaterias());
        System.out.println("Cantidad de materias de Martinez: "+lp.cantidadMaterias());
        
    }
    
}
