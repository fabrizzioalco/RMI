import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Hello.Hello;

public class Server extends UnicastRemoteObject implements Hello {
    public Server() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hello World!";
    }

    public static void main(String args[]) {
        // Create and install a security manager
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new RMISecurityManager());
        try {
            // createRegistry(1099);
            Hello obj = new Server();
            // Bind this object instance to the name "HelloServer“
            Naming.rebind("///HelloServer", obj);
        } catch (Exception e) {
        }
    }
}