import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Banco {


    @Setter
    @Getter
    protected String nome;
    @Getter
    @Setter
    private List<Conta> contas;

    List<Cliente> clientes = new ArrayList<Cliente>();

    public void mostrarClientes() {

        System.out.println(clientes);
    }
}