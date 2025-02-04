import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = sc1.nextInt();

        System.out.println("Por favor, digite o nome da Agência: ");
        String agencia = sc1.next();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nome_cliente = sc1.next();

        System.out.println("Por favor, digite o saldo do Cliente: ");
        Double saldo = sc1.nextDouble();
        System.out.println("Olá " +  nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo " + saldo +" já está disponível para saque");


    }
}