package cursojava;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

public class CursoJava {

    public static void main(String[] args) {
        // Video 36# bucles

        /*
        int numero=0, suma_pos=0, conteo_pos=0, suma_neg=0, conteo_neg=0, conteo_ceros=0;
        float media_pos, media_neg;
        
        for(int i=1; i<10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }
        
        if(numero== 0){ //si el numero es cero
            conteo_ceros++;//aumentamos en 1 el conteo de 0
        }
        else if(numero>0){ //si el numero es positivo
            suma_pos +=numero; //suma iterativa de positivos
            conteo_pos++; 
        }
        else{ // si el numero es negativo
            suma_neg += numero;
            conteo_neg++;
        }
        
        //Tratamos con los positivos
        if(conteo_pos == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }
        else{
            media_pos= (float) suma_pos/conteo_pos;
            System.out.println("La media de los positivos es: "+ media_pos);
        }
        
        //tratamos con los negativos
        if(conteo_neg == 0){
            System.out.println("No se puede sacar la media de los negativos");
        }
        else{
            media_neg = (float) suma_neg/ conteo_neg;
            System.out.println("la media de negativos es: "+ media_neg);
        }
        
        System.out.println("La cantidad de ceros es: "+ conteo_ceros);
        */
        
        //video numero #37 bucles
        
        /*int edad, sumaEdad=0, conteoMayor18=0, conteoMayor175=0;
        float altura,sumaAltura=0,mediaEdad=0,mediaAltura=0;
        
        for (int i = 0; i < 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+ i + "\nDigite su edad"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+ i + "\nDigite su altura"));
            
            sumaEdad += edad; //suma iterativa de edades
            sumaAltura += altura; //suma iterativa de las alturas
            
            if(edad > 18){ //si la edad es mayor a 18
                conteoMayor18++;
            }
            if(altura > 1.75){ //si la altura es mayor a 1.75
                conteoMayor175++;
            }
            
            mediaEdad = (float) sumaEdad/5;
            mediaAltura = (float) sumaAltura/5;
            
            System.out.println("la edad promedio es: "+mediaEdad);
            System.out.println("la altura promeio es: "+mediaAltura);
            System.out.println("la cantidad de alumnos matores a 18 años: "+conteoMayor18);
            System.out.println("La cantidad de alumnos que miden mas de 1.75 es: "+conteoMayor175);
                    
        }*/
        
        //Ejercicio 16
        /*
        pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
        */
        
        //arreglar
        /*Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt();
        int multiplicacion=1;
        Scanner entrada = new Scanner(System.in);
        
        for(int i=1; i == 10; i++){
            numeroAleatorio *= multiplicacion;
            multiplicacion++;
            System.out.println(numeroAleatorio);
        }
        System.out.println("el numero es: "+numeroAleatorio + "*" + multiplicacion);*/
        
        //video nuermo 38# bucles
        //ejer 17
        
        /*int codigo, litros,litrosArticulo1=0,conteoMas600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for(int i=1; i <=5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite la cantidad de litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite el precio por litro: "));
            
            importeFactura = (float) litros * precioLitro; //importe por factura
            facturacionTotal += importeFactura; // suma iterativa de las facturas
            
            if(codigo == 1){
                conteoMas600++;
            }
            if(importeFactura > 600){
                conteoMas600++;
            }
        }
        
        System.out.println("Resumen de ventas");
        System.out.println("facturacion total: "+facturacionTotal);
        System.out.println("La cantidad de litros vendidos del articulo 1: "+ litrosArticulo1);
        System.out.println("La cantida de facturas mayores a 600: "+conteoMas600);*/
        
        //Video numero 39# bucles
        //ejer19
        
        /*float nota;
        int aprobados=0, condicionados=0, suspensos=0;
        
        for (int i = 0; i <= 6; i++) {
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10: "));
            }while(nota < 0 || nota > 10);
            
            if(nota == 4){ //si noes es igual a 4
                condicionados++;
            }
            else if(nota >=5){
                aprobados++;
            }
            else{
                suspensos++;
            }
            
            System.out.println("Cantidad de aporbados: "+aprobados);
            System.out.println("Cantidad de condicionados: "+condicionados);
            System.out.println("Cantidad de reprobados: "+suspensos);
        
        }*/
        
        //video numero 40# bucles
        //ejer21
        
        /*int numero;
        boolean hay_negativos = false;
        
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if(numero < 0){ //si el numero es negativo
                hay_negativos = true;
            }
        }
        
        if(hay_negativos == true){
            System.out.println("Si existe un numero negativo");
        }
        else{
            System.out.println("No existe ningun numero negativo");
        }*/
        
        //Video numero 41# arreglos
        
        /*int[] numeros = new int[3]; //{1,2,3}; para inicializar el arreglos con valores
        
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }*/
        
        //video numero 42# arrelgos
        
        /*int nElementos;
        Scanner entrada = new Scanner(System.in);
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantida de elementos"));
        
        char[] letras = new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1) + ". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        
        System.out.println("\nLos caracteres del arelgos son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(letras[i]);
        }*/
        
        //video numero 43#
        /*
        String[] nombres= {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis","Roberto","flor","Jessica"};
        
        /*for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }*/
        
        /*for(String i:nombres){ //for each
            System.out.println(i);
        }*/
        
        //video numero 44#
        //ejer1
        
        /*Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        } */
        
        //video numero 45#
        //ejer3
        
        /*Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float suma_positivos=0,suma_negativos=0,media_positivos,media_negativos;
        int conteo_positivos=0,conteo_negativos=0,conteo_ceros=0;
        
        System.out.println("guardando los numeros en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
            
            if(numeros[i] == 0){
                conteo_ceros++;
            }
            else if(numeros[i] > 0){
                suma_positivos += numeros[i];
                conteo_positivos++;
            }
            else{
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }
        
        //Media de los numeros positivos
        if(conteo_positivos == 0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }
        else{
            media_positivos = suma_positivos / conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+media_positivos);
        }
        
        //Media de numeros negativos
        if(conteo_negativos == 0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }
        else{
            media_negativos = suma_negativos / conteo_negativos;
            System.out.println("La media de los numeros negativos es : " +media_negativos);
        }
        
        System.out.println("La cantidad de ceros es: "+conteo_ceros);*/
        
        //video numero 46# arreglos
        //ejer5
        
        /*Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        
        a= new int[10]; //arreglos a 10 elementos
        b = new int[10]; //arreglo b con 10 elementos
        c = new int[20]; //arrelgo c con 20 elementos
        
        //pedimos arreglos a
        System.out.println("Digite el primer arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digite un numero");
            a[i] = entrada.nextInt();
        }
        
        //pedimos el arreglo b
        System.out.println("\nDigite el segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+": Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        //ahora vamos a mezclar los dos arreglos en el arreglo c
        //vamos a utilizar el iterador i para a y b, 
        //y el iterador j para c
        int j=0;
        for (int i = 0; i < 10; i++) {
            c[j]= a[i]; //1*A
            j++;
            c[j] = b[i]; //1*B
            j++;
        }
        
        System.out.println("\nEl tercer arrelgos es: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(c[i]+ " ");
        }
        System.out.println();*/
        
        //Video numero 47#
        //ejer7
        
        /*Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //creamos el areglo de 10 elementos enteros
        boolean creciente=false,decreciente=false;
        
        System.out.println("Llenar arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digite un numero");
            arreglo[i]= entrada.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            if(arreglo[i] < arreglo[i+1]){ //creciente: 1-2-3-4
                creciente = true;
            }
            if(arreglo[i] > arreglo[i+1]){ //decreciente : 4-3-2-1
                decreciente = true;
            }
        }
        
        if(creciente == true && decreciente == false){
            System.out.println("\nEl arreglo esta en forma creciente");
        }
        else if(creciente ==false && decreciente== true){
            System.out.println("\nEl arreglo esta en forma decreciente");
        }
        else if(creciente==true && decreciente==true){
            System.out.println("\nEl arrelgo esta desornedano");
        }
        else if(creciente == false && decreciente==false){
            System.out.println("\nTodos los numeros del arreglo son iguales");
        }*/
        
        //Video numero 48# ejer9
        
        /*Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //creamos el arreglo de 10 elementos enteros
        int ultimo;
        
        System.out.println("Llenar el arrelgo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        ultimo = arreglo[9]; //guardamos el ultimo elemento
        
        for (int i = 8; i>= 0; i--) { //Avanzar una posicio hacia abajo en el arreglo
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[0] = ultimo; //ponemos el ultimo elmento como primero
        
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+". Numero: "+arreglo[i]);
        }*/
        
        //Video numero 49# ejer11
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente= false;
        int numero,sitio_numero=0,j=0;
        
        System.out.println("Llenar arrglo");
        do{
            for (int i = 0; i < 5; i++) {
                System.out.println((i+1)+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //comprobar si el arreglo esta ordenado en forma creciente
            for (int i = 0; i < 4; i++) {
                if(arreglo[i] < arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("el arreglo no esta ordenado en forma creciente, vuelva a digitar");
            }
        }while(creciente == false);
        
        System.out.println("Digite un elemento a insertar");
        numero = entrada.nextInt();
        
        while(arreglo[j] < numero && j < 5){
            sitio_numero++;
            j++;
        }
        
        //Por ultimo, trasladamos una posicion en el arrelgo a los elementos que van detras de numero
        for (int i = 4; i >= sitio_numero ; i--) {
            arreglo[i+1] = arreglo[i];
        }
        
        //insertamos el numero que el usuario puso
        arreglo[sitio_numero] = numero;
        
        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
    
}
