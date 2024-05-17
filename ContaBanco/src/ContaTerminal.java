import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e imprimir a classe Scanner
        //Exibir as mensagens para o usuario
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner informacaoUsuario = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = informacaoUsuario.nextInt();

        System.out.print("Digite sua agencia: ");
        String agencia = informacaoUsuario.next();

        informacaoUsuario.nextLine(); // Consome a linha restante

        System.out.print("Digite seu nome completo: ");
        String nome = informacaoUsuario.nextLine();

        System.out.print("Por favor, digite seu saldo atual R$: ");
        double saldo = informacaoUsuario.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " +numero+ " e seu saldo "+saldo+"R$ já está disponível para saque.");

       

    }
}
