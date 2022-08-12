
package URL;

import java.net.*;
import java.io.*;

public class UrlClasse {

    
    public static void main(String[] args) {
        try{
            /*
              URL url = new URL("http://www.google.com/javaf.php");
              System.out.println("le nom protocol est : " + url.getProtocol());
              System.out.println("le nom d'hote est : " + url.getAuthority());
            InputStream str = con.getInputStream();
             */
   
             //================HttpURLConnexion====================//
          
        /*
              //==  HttpURLConnection con = (HttpURLConnection) url.openConnection(); ==//
               for(int i = 0 ; i<8; i++)
               {
                 System.out.println(con.getHeaderFieldKey(i) + " = " + con.getHeaderField(i));  
               }
             con.disconnect();
*/
             //=======================================================================//
         
           //==========inetAddress ===============================//
             
           /*InetAddress add = InetAddress.getByName("www.google.com"); //renvoie l'instance de nom d'ip et hote
             System.out.println("Nom d'hote = " + add.getHostName()); 
             System.out.println("Nom d'addresse ip = " + add.getHostAddress()); 
*/
           //===================datagrameSocket et DatagramPacket============//
           DatagramSocket sc = new DatagramSocket(); //creation d'objet datagramsocket
           String str = "bonjour le monde!";
           InetAddress ip = InetAddress.getByName("localhost");//une addresse par ip
           DatagramPacket pac = new DatagramPacket(str.getBytes(),str.length(),ip,3030);
           sc.send(pac);
           sc.close();
        }catch(Exception e)
        {
            System.err.println(e);  
        }
      
    }
    
}
