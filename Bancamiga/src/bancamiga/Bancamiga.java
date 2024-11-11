package bancamiga;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bancamiga {

    public static void main(String[] args) {
        try{
            String ruta = "Clientes.in";
            
            File archivo = new File(ruta);
            
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            
            FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.close();
            
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
