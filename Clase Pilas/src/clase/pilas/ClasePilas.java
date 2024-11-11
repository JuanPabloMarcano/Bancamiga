/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pilas;

/**
 *
 * @author Silver
 */

class nodo{
    int valor;
    nodo down;
    nodo(int valor){
        this.valor = valor;
    }
    nodo(int valor, nodo down){
        this.valor = valor;
        this.down = down;
    }
}

class pila{
    nodo Top;
    void push(int valor){ // 1
        if (this.isEmpty()) {
            this.Top = new nodo(valor); // new nodo(1)
        }else{
            this.Top = new nodo(valor, this.Top);
        }
    }
    boolean isEmpty(){
        return this.Top == null; 
    }
    /*int pop(){
        int valor_temp;
        if (this.isEmpty()){
            System.out.println("Pila Vacia");
            return 0;
        }else{
            valor_temp = this.Top.valor;
            this.Top = this.Top.down;
            return valor_temp;
        }
    }*/
    nodo pop(){
        nodo valor_temp;
        if (this.isEmpty()){
            System.out.println("Pila Vacia");
            return null;
        }else{
            valor_temp = this.Top;
            this.Top = this.Top.down;
            valor_temp.down = null;
            return valor_temp;
        }
    }
    /*void peek(){
        if (this.isEmpty()) {
            System.out.println("Pila Vacia");
        }else{
            System.out.println(this.Top.valor);
        }
    }*/
    nodo peek(){
        if (this.isEmpty()) {
            System.out.println("Pila Vacia");
            return null;
        }else{
            return new nodo(this.Top.valor);
        }
    }
    String mostrarPila(){
        nodo temporal = null;
        String datos = "TOP ";
        while (!this.isEmpty()){
            datos += " -> " + this.peek().valor;
            if (temporal == null) {
                temporal = new nodo(this.pop().valor);
            }else{
                temporal = new nodo(this.pop().valor, temporal);
            }
        }
        while (temporal != null){
            this.push(temporal.valor);
            temporal = temporal.down;
        }
        return datos;
    }
}

public class ClasePilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pila p = new pila();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        System.out.println(p.peek().valor);
        
        System.out.println("Pila = " + p.mostrarPila());
    }
    
}
