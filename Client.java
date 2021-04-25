import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
 

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         HelloInterface stub = (HelloInterface) registry.lookup("Hello"); 
         System.setProperty("java.rmi.server.hostname","127.0.0.1");
    
         // Calling the remote method using the obtained object 
         stub.printMsg(); 
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}