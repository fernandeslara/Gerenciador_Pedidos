import java.io.Serializable;
import java.time.LocalDate;

public class Pedido implements Serializable {
    private int numero;
    private Cliente cliente;
    private LocalDate data;
    private LocalDate dataEntrega;
    private double preco;

    // Construtor para pedidos simples
    public Pedido (int numero, Cliente cliente, LocalDate data, double preco) {
        this.numero = numero;
        this.cliente = cliente;
        this.data = data;
        this.preco = preco;
    }

    // Construtor para pedidos expressos
    public Pedido (int numero, Cliente cliente, LocalDate data, double preco, LocalDate dataEntrega) {
        this.numero = numero;
        this.cliente = cliente;
        this.data = data;
        this.dataEntrega = dataEntrega;
        this.preco = preco * 1.2; // Acréscimo de 20% para entrega expressa
    }

    public boolean VerificaEntrega () {
        return dataEntrega != null && dataEntrega.equals(data);
    }

    public int getNumero(){
        return numero;
    }

    public Cliente getCliente(){
        return cliente;
    }
    
    public LocalDate getData(){
        return data;
    }

    public double getPreco(){
        return preco;
    }

    public LocalDate getDataEntrega(){
        return dataEntrega;
    }

    @Override
    public String toString () {
        String entrega = VerificaEntrega()? "Data de Entrega: " + dataEntrega.toString() : "";
        return "Pedido:\n" +
               "Cliente: " + cliente.getNome() + "\n" + 
               "Preço: " + preco + "\n" +
                entrega + "\n";
    }
}
