public class Livro extends Produto implements Identificavel{
    String isbn;
    int totalDePaginas;

    @Override
    public String identificar() {
        return "ISBN: " + this.isbn + " Nome: " + this.nome;
    }
}
