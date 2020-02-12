package modelo.persistencia;

public class DadosExeption extends Exception {
    public DadosExeption(String message) {
        super(message);
    }

    public DadosExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
