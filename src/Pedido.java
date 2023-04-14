import java.util.ArrayList;
public class Pedido {
    private Massa massa;
    private Cliente cliente;
    private ArrayList<Ingrediente> ingredientes;

    public Pedido(Massa massa, Cliente cliente, ArrayList<Ingrediente> ingredientes) {
        this.massa = massa;
        this.cliente = cliente;
        this.ingredientes = ingredientes;
    }

    public double calcularValor() {
        double valor = massa.getValor();
        valor += ingredientes.size() * 2.0;
        return valor;
    }

    public String toString() {
        String ingredientesStr = "";
        for (Ingrediente ingrediente : ingredientes) {
            ingredientesStr += ingrediente.getNome() + " e ";
        }
        ingredientesStr = ingredientesStr.substring(0, ingredientesStr.length() - 3);
        return "Pedido feito para " + cliente.getNome() + "\n" +
                massa.getTipo() + " com " + ingredientesStr + "\n" +
                "Valor: " + calcularValor();
    }
}
