public class Cliente implements Identificavel{
    String nome;
    String cpf;

    @Override
    public String identificar() {
        return "Nome: " + this.nome + " CPF: " + this.cpf;
    }

    //resto das propriedades
}
