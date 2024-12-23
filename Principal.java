import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        try {
            Cliente cliente1, cliente2;
            cliente1 = new Cliente("Fulano", 9999, "rua A");
            cliente2 = new Cliente("Ciclano", 8888, "rua B"); 
            
            Pedido pedido1;
            pedido1 = new Pedido(1, cliente1, LocalDate.now(), 500);
    
            PedidoExpresso pedido2;
            pedido2 = new PedidoExpresso(2, cliente2, LocalDate.now(), 500, LocalDate.now());

            // Lista de objetos para salvar
            List<Object> objetosParaSalvar = new ArrayList<>();
            objetosParaSalvar.add(cliente1);
            objetosParaSalvar.add(cliente2);
            objetosParaSalvar.add(pedido1);
            objetosParaSalvar.add(pedido2);

              // Salvando em arquivo
              ArquivoUtil.salvarEmArquivo("dados.obj", objetosParaSalvar);

              // Recuperando objetos do arquivo
              List<Object> objetosRecuperados = ArquivoUtil.recuperarDeArquivo("dados.obj");
  
              // Exibindo os objetos recuperados
              for (Object obj : objetosRecuperados) {
                  System.out.println(obj);
              }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
