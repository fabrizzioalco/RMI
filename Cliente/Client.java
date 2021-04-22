package Cliente;

import java.applet.Applet;
import java.awt.Graphics;
import java.rmi.Naming;
import java.rmi.RemoteException;

import Hello.Hello;

public class Client {
    String message = "blank";
    // "obj" is the identifier that we'll use to refer to the remote object that
    // implements the "Hello" interface
    Hello obj = null;

public Client() {
try {
obj = (Hello)Naming.lookup("//1HelloServer");
message = obj.sayHello();
System.out.println(“Message ${message}“);
} catch (Exception e) {}

    public static void main(String args[]) {
        Client client = new Client();
    }
}