import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry;

import java.rmi.server.UnicastRemoteObject;

public class Server extends RmiRegistry { 
   public Server() {} 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         RmiRegistry obj = new RmiRegistry(); 
         System.setProperty("java.rmi.server.hostname","127.0.0.1");
    
         // Exporting the object of implementation class  
         // (here we are exporting the remote object to the stub) 
         HelloInterface stub = (HelloInterface) UnicastRemoteObject.exportObject(obj, 0);  
         
         // Binding the remote object (stub) in the registry 
         Registry registry = LocateRegistry.getRegistry(); 
         
         registry.bind("Hello", stub);  
         System.err.println("Server ready"); 
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
} 