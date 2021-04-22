package Hello;
//Todas las interfaces remotas deben implementar la interfaz Remote
import java.rmi.Remote;
//Todos los métodos remotos tienen que tener la posibilidad de lanzarla excepción RemoteException
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}