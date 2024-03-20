public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Radio";

        System.out.println(produto.nome);

        Livro livro = new Livro();
        livro.isbn = "12345-12345";
        livro.totalDePaginas = 300;
        livro.nome = "Senhor dos Anéis";

        System.out.println(livro.nome);

        Eletronico eletronico = new Eletronico();
        eletronico.nome = "Smartphone";

        System.out.println(eletronico.nome);
    }
}
