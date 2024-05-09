import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    public Banco banco;

    public String nome;

    public String endereco;

    public String email;

    public String telefone;


    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }


    public Cliente(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }




    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }


    @Override
    public String toString() {
        return "Cliente {" +
                "banco=" + banco.nome + ", nome='" + this.getNome() +
                '}';
    }
}