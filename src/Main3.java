//Card 5
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o ID do produto: ");
            int idProduto = leitura.nextInt();
            System.out.println("ID do produto: " + idProduto);
        }catch (InputMismatchException e){
            System.out.println("Erro! Você não digitou um número inteiro.");
        }


    }
}
