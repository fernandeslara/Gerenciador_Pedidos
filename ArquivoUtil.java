import java.io.*;
import java.util.List;

public class ArquivoUtil {
    // Método para salvar uma lista de objetos em arquivo
    public static <T> void salvarEmArquivo(String caminho, List<T> objetos) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(objetos);
        }
    }

    // Método para recuperar uma lista de objetos de arquivo
    @SuppressWarnings("unchecked")
    public static <T> List<T> recuperarDeArquivo(String caminho) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            return (List<T>) ois.readObject();
        }
    }
}