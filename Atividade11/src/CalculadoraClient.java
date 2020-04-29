
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Victor De Souza
 */
public class CalculadoraClient {

    public static void main(String[] args) {
        
        try {
            CalculadoraRemota calculadora = (CalculadoraRemota) Naming.lookup("//127.0.0.1:1099/CalculadoraServer");
            System.out.println("2 + 2 é igual a " + calculadora.somar(2, 2));
            System.out.println("2 - 2 é igual a " + calculadora.subtrair(2, 2));
            System.out.println("2 x 2 é igual a " + calculadora.multiplicar(2, 2));
            System.out.println("2 / 2 é igual a " + calculadora.dividir(2, 2));
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
            System.err.println("Deu ruim: " + ex.getMessage());
        }
    }
}

