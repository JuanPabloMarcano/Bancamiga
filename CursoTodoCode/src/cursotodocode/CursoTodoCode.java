package cursotodocode;

//import java.util.Scanner;

public class CursoTodoCode {

    public static void main(String[] args) {
        
       Alumno alu1 = new Alumno();
       Alumno alu2 = new Alumno(5, "Luisina", "de Paula");
       
       
       System.out.println("la id del alumno 2 es: " + alu2.getId());
       System.out.println("el nombre es: "+ alu2.getNombre());
       System.out.println("el apellido es: "+ alu2.getApellido());
       
       alu1.setId(8);
       alu1.setNombre("Suscribirse");
       alu1.setApellido("TodoCode");
       
       System.out.println("-----------------------");
       System.out.println("la id del alumno 2 es: " + alu1.getId());
       System.out.println("el nombre es: "+ alu1.getNombre());
       System.out.println("el apellido es: "+ alu1.getApellido());
       System.out.println("-----------------------");
       
       //cambio de valor
       alu2.setId(35);
       
       System.out.println("la id del alumno 2 es: " + alu2.getId());
       System.out.println("el nombre es: "+ alu2.getNombre());
       System.out.println("el apellido es: "+ alu2.getApellido());
    }
    
}
