package Entidades.Transactions;


public abstract class Transacoes {
    protected String data;
    protected double valor;
    protected String tipo;
    protected String categoria;
    protected String descricao;
    protected int id;

    public Transacoes(String data, double valor, String tipo, String categoria, String descricao) {
        this.id = gerarNovoId();
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public void exibirDetalhes() {
        System.out.println("");
        System.out.println("-----------");
        System.out.println(tipo + ":");
        System.out.println("Data: " + data);
        System.out.println("Valor: " + valor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Transação: " + descricao);
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return this.id;
    }

    private static int ultimoId = 0;
    private static int gerarNovoId() {
        return ++ultimoId;
    }
}
