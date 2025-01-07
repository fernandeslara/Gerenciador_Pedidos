import java.io.Serializable;

public class Cliente implements Serializable {
    private String nome;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }
    
    public String getEndereco(){
        return endereco;
    }
}
