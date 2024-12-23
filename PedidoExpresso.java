import java.io.Serializable;
import java.time.LocalDate;

public class PedidoExpresso extends Pedido implements Serializable{
    private LocalDate dataEntrega;

    public PedidoExpresso (int numero, Cliente cliente, LocalDate data, double preco, LocalDate dataEntrega){
        super(numero, cliente, data, preco * 1.2);
        this.dataEntrega = dataEntrega;
    }

    public boolean EntregueNoPrazo(){
        return getData().equals(dataEntrega);
    }

    public String toString() {
        return "PedidoExpresso{" +
                "Cliente=" + getCliente().getNome() +
                ", Preço=" + getPreco() +
                ", Entregue no prazo=" + EntregueNoPrazo() +
                '}';
    }
}
