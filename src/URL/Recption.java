
package URL;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Recption {

   
    public static void main(String[] args) {
        try
        {
             DatagramSocket sc = new DatagramSocket(3030);
             byte[] tab = new byte[1024];
             DatagramPacket pc = new DatagramPacket(tab, 1024);
             sc.receive(pc);
             String str = new String(pc.getData(),0,pc.getLength());
             System.out.println(str);
             sc.close();
             
        }catch(Exception e)
        {
            System.out.println(e);  
        }
       
    }
    
}
