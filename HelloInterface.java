import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface HelloInterface extends Remote {  
   void printMsg() throws RemoteException;  
} 