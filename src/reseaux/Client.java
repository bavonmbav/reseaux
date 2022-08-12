
package reseaux;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client {
    
   public static void main(String[] args)
    {
        try {
            Socket socket = new Socket("localhost",22); 
            /*
            * le premier argument est l'adresse de notre pc
            puise que l'application tourne sur le meme systeme de serveur local
            */
            DataOutputStream ecrire = new DataOutputStream(socket.getOutputStream());
            DataInputStream data = new DataInputStream(socket.getInputStream());
            BufferedReader lire = new BufferedReader(new InputStreamReader(System.in));
            String str = "", stre = "";
            while(!str.equals("stop"))
            {
              str = lire.readLine();
              ecrire.writeUTF(str);
              ecrire.flush();  
                
              stre = data.readUTF();

              System.out.println("message serveur = "+stre); 
              
            }
            
            
            
            
            
            
            
            
         //   ecrire.writeUTF("bonjour le serveur");
         //   ecrire.writeUTF("je suis le client");
           
            ecrire.close();
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
