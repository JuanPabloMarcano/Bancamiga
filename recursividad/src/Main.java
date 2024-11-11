class recursividad {

    double factorial(int n){
        if (n<=1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

}

class nodo{
    int valor;
    nodo down;
    nodo(int valor){
        this.valor = valor;
    }
}


class pila {
    nodo top;

    boolean isEmpty() {
        return top == null;
    }
    void push(int val){
        if (isEmpty()){
            top = new nodo(val);
        }else{
            nodo nuevo = new nodo(val);
            nuevo.down = top;
            top = nuevo;
        }
    }
    int conteo(nodo actual){
        if (isEmpty()){
            return 0;
        }else{
            if (actual.down == null){
                return 1;
            }else{
                return 1 + conteo(actual.down);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        recursividad r =  new recursividad();
//        System.out.println("factorial de 16 = " + r.factorial(60));
        pila p = new pila();
        p.push(1);
        p.push(2);
        p.push(12);
        p.push(14);
        p.push(11);
        p.push(15);
        p.push(111);
        p.push(12);
        p.push(13);
        p.push(14);
        p.push(15);
        System.out.println("hay " + p.conteo(p.top) + " elementos en la pila");

    }
}