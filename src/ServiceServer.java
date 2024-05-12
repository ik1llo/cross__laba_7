import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceServer extends UnicastRemoteObject implements RemoteInterface {
    public ServiceServer() throws RemoteException { super(); }

    @Override
    public int add(int a, int b) throws RemoteException { return a + b; }

    @Override
    public int subtract(int a, int b) throws RemoteException { return a - b; }

    @Override
    public int multiply(int a, int b) throws RemoteException { return a * b; }
}
