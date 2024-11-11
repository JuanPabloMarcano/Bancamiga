package ruletacasino;

import java.io.File;
import java.io.IOException;

public class RuletaCasino {

    public static void main(String[] args) {
        
        // Archivos de Jugador 1,2,3,4
        try{
            String jugador_1 = "Jugador_1.txt";
            String jugador_2 = "Jugador_2.txt";
            String jugador_3 = "Jugador_3.txt";
            String jugador_4 = "Jugador_4.txt";
            
            File archivo_1 = new File(jugador_1);
            File archivo_2 = new File(jugador_2);
            File archivo_3 = new File(jugador_3);
            File archivo_4 = new File(jugador_4);
            
            if(!archivo_1.exists()){
                archivo_1.createNewFile();
            }
            if(!archivo_2.exists()){
                archivo_2.createNewFile();
            }
            if(!archivo_3.exists()){
                archivo_3.createNewFile();
            }
            if(!archivo_4.exists()){
                archivo_4.createNewFile();
            }
            
            System.out.println("Jugadores Archivados");
        }catch(IOException e){
            
            e.printStackTrace();
        }
    }
    
}
