import  java.io.Serializable;
import java.time.LocalDate;

public class Pedido implements Serializable {
    private int numero;
    private Cliente cliente;
    private LocalDate data;
    private double preco;

    public Pedido (int numero, Cliente cliente, LocalDate data, double preco){
        this.numero = numero;
        this.cliente = cliente;
        this.data = data;
        this.preco = preco;
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
    
    

    public String toString() {
        return "Pedido{" + "Cliente=" + cliente.getNome() + ", Preço=" + preco + "}";
    }
}