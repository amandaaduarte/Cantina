import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Cantina {
    public static void main(String[] args) {
        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        Cliente cliente = new Cliente(nomeCliente);

        String nomeMassa = JOptionPane.showInputDialog("Informe o nome da massa:");
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));
        Massa massa = new Massa(nomeMassa, valorMassa);

        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        String[] opcoesIngredientes = { "Bacon", "Mussarela", "Tomate", "Queijo", "Sair" };
        int opcaoEscolhida;
        do {
            opcaoEscolhida = JOptionPane.showOptionDialog(null, "Escolha os ingredientes:", "Cantina", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesIngredientes, opcoesIngredientes[0]);
            if (opcaoEscolhida >= 0 && opcaoEscolhida < opcoesIngredientes.length - 1) {
                Ingrediente ingrediente = new Ingrediente(opcoesIngredientes[opcaoEscolhida]);
                ingredientes.add(ingrediente);
            }
        } while (opcaoEscolhida != opcoesIngredientes.length - 1);

        Pedido pedido = new Pedido(massa, cliente, ingredientes);
        JOptionPane.showMessageDialog(null, pedido.toString(), "Cantina", JOptionPane.PLAIN_MESSAGE);
    }
}