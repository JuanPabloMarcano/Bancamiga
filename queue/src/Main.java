//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class nodo{
    String nombre;
    String apellido;
    String cedula;
    int edad;
    nodo siguiente;
    nodo(String nombre, String apellido, String ced, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }
}

class cola{
    nodo front, tail;
    int valorPreferencial = 60;
    int cantPreferencia = 2;
    void encolar(String nombre, String apellido, String cedula, int edad){
        if (front == null){
            front = tail = new nodo(nombre, apellido, cedula,edad);
        }else{
            tail.siguiente = new nodo(nombre, apellido, cedula,edad);
            tail = tail.siguiente;
        }
    }
    void encolar(nodo nuevo){
        nuevo.siguiente = null;
        if (front == null){
            front = tail = nuevo;
        }else{
            tail.siguiente = nuevo;
            tail = tail.siguiente;
        }
    }
    nodo desencolar(){
        nodo temporal = front;
        front = front.siguiente;
        temporal.siguiente=null;
        return temporal;
    }
    nodo desencolarPrioridad(){
        cola colaTemp = new cola();
        nodo temporal = null;
        while (front != null || front.edad >= 60){
            colaTemp.encolar(this.desencolar());
        }
        if (front == null){
            this.front = colaTemp.front;
            this.tail = colaTemp.tail;
            return this.desencolar();
        }else{
            temporal = this.desencolar();
            colaTemp.tail.siguiente = front;
            front = colaTemp.front;
            return temporal;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
        }
    }
}