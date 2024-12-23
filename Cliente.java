import java.io.Serializable;

public class Cliente implements Serializable{
    private String nome;
    private int tel;
    private String end;

    public Cliente(String nome, int tel, String end){
        this.nome = nome;
        this.tel = tel;
        this.end = end;
    }

    public String getNome(){
        return nome;
    }

    public int getTel(){
        return tel;
    }
    
    public String getEnd(){
        return nome;
    }
    
}
