public class Main2 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Harry Potter";
        livro.isbn = "98745-55478";

        System.out.println(livro.identificar());

        Cliente cliente = new Cliente();
        cliente.cpf = "12356789-77";
        cliente.nome = "Fulano";
        System.out.println(cliente.identificar());
    }
}
