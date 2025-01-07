import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorArquivos {

    // Método para salvar uma lista de clientes em um arquivo
    public static void salvarClientes(String nomeArquivo, List<Cliente> clientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.err.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }

    // Método para carregar uma lista de clientes de um arquivo
    @SuppressWarnings("unchecked")
    public static List<Cliente> carregarClientes(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (List<Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar clientes: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    // Método para salvar uma lista de pedidos em um arquivo
    public static void salvarPedidos(String nomeArquivo, List<Pedido> pedidos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(pedidos);
        } catch (IOException e) {
            System.err.println("Erro ao salvar pedidos: " + e.getMessage());
        }
    }

    // Método para carregar uma lista de pedidos de um arquivo
    @SuppressWarnings("unchecked")
    public static List<Pedido> carregarPedidos(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (List<Pedido>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar pedidos: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    // Método para exportar uma lista de clientes para um arquivo CSV
    public static void exportarClientesParaCSV(String nomeArquivo, List<Cliente> clientes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            writer.println("Nome,Telefone,Endereco");
            for (Cliente cliente : clientes) {
                writer.printf("%s,%s,%s%n", cliente.getNome(), cliente.getTelefone(), cliente.getEndereco());
            }
        } catch (IOException e) {
            System.err.println("Erro ao exportar clientes para CSV: " + e.getMessage());
        }
    }

    // Método para exportar uma lista de pedidos para um arquivo CSV
    public static void exportarPedidosParaCSV(String nomeArquivo, List<Pedido> pedidos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            writer.println("Numero,Cliente,Data,Preco,DataEntrega");
            for (Pedido pedido : pedidos) {
                String dataEntrega = pedido.getDataEntrega() != null ? pedido.getDataEntrega().toString() : "";
                writer.printf("%d,%s,%s,%.2f,%s%n", pedido.getNumero(), pedido.getCliente().getNome(), pedido.getData(), pedido.getPreco(), dataEntrega);
            }
        } catch (IOException e) {
            System.err.println("Erro ao exportar pedidos para CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Criando alguns clientes e pedidos para teste
        Cliente cliente1 = new Cliente("Fulano", "9999", "Rua A");
        Cliente cliente2 = new Cliente("Ciclano", "8888", "Rua B");

        Pedido pedido1 = new Pedido(1, cliente1, LocalDate.now(), 500.0);
        Pedido pedido2 = new Pedido(2, cliente2, LocalDate.now(), 500.0, LocalDate.now());

        // Criando listas para salvar
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        // Salvando as listas em arquivos
        salvarClientes("clientes.dat", clientes);
        salvarPedidos("pedidos.dat", pedidos);

        // Exportando para CSV
        exportarClientesParaCSV("clientes.csv", clientes);
        exportarPedidosParaCSV("pedidos.csv", pedidos);

        System.out.println(pedido1);
        System.out.println(pedido2);
    }
}
