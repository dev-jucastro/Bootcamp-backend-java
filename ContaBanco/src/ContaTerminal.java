import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

         try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite sua conta");
            int conta = scanner.nextInt();
            
            System.out.println("Por favor digite sua Agência");
            int agencia = scanner.nextInt();

            System.out.println("Por favor, digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Por favor, digite seu saldo");
            float valor = scanner.nextFloat();

            //imprimindo os dados obtidos pelo usuario
    System.out.println("Ola, " + nome + " obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + conta + " e seu saldo " + valor + " já está disponível para saque.");
        }

     
    }
}  
   