package newpackage;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operacoes {
    ArrayList<Cliente> clientes;

    public Operacoes() {
        cliente = new ArrayList<Cliente>(); 
    }

    public void cadastroCliente() {
        Cliente cliente = new Cliente();
        int aux = clientes.size() + 1; 
        cliente.setCodigo(aux);
        cliente.setNome(JOptionPane.showInputDialog((aux)
                + "º Cliente\nNome: "));
        cliente.setEmail(JOptionPane.showInputDialog("E-mail: "));

        clientes.add(cliente);
    }
}

