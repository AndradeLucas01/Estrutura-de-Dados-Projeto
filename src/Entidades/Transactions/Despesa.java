package Entidades.Transactions;

public class Despesa extends Transacoes {
    String[] conf = {"Essencial", "Supérfluo"};

    public Despesa(String data, Double valor, String categoria, String descricao) {
        super(data, valor, "Despesa", categoria, descricao);
    }

    @Override
    public void setCategoria(String categoria) {
        boolean categoriaValida = false;
        for (String cat : conf) {
            if (cat.equals(categoria)) {
                categoriaValida = true;
                break;
            }
        }
        if (categoriaValida) {
            super.setCategoria(categoria);
        } else {
            throw new IllegalArgumentException("Categoria inválida. Permitidas: Essencial, Supérfluo.");
        }
    }
}
