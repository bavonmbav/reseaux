
package reseaux;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket; //elle est utiliser pour creer un socket

public class Sockets {
    
    public static void main(String[] args)
    {
        try { 
            /*
            * la classe serversocket etablie la communication avec le client 
            */
            ServerSocket serveur = new ServerSocket(22); 
            /*creation d'un socket 
            * la classe socket est representer comme un point de communicaton entre les machines
             la methode accept() attend que le client se connecte avec le meme num de port

             */
            Socket soc = serveur.accept(); //en meme temps cette methode etablit la connexion et attend le client
           
            DataOutputStream doc = new DataOutputStream(soc.getOutputStream());
            DataInputStream data = new DataInputStream(soc.getInputStream());
            BufferedReader lire = new BufferedReader(new InputStreamReader(System.in));
            String str = "", stre = "";
            while(!str.equals("stop"))
            {
              str = data.readUTF();
                System.out.println("message client = "+str); 
                
              stre = lire.readLine();
              doc.writeUTF(stre);
              doc.flush();
            }
            lire.close();
            data.close();
            soc.close();
           /* String mot = (String)data.readUTF();
            
            System.out.println("message= "+mot); 
            System.out.println("message= "+mot); 
            
            */
            serveur.close();
                
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
