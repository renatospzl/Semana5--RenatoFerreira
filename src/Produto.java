public class Produto {
    String nome;
    String descricao;
    double precoUnico;
    int quantidade;

    public Produto(){}

    public Produto(ProdutoRecord produtoRecord) {
        this.nome = produtoRecord.title();
        this.descricao = produtoRecord.description();
    }

    @Override
    public String toString() {
        return "***Nome: " + this.nome + "***" +", ***Descricao: " + this.descricao + "***";
    }
}
