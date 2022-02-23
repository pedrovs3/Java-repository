import java.util.Scanner;

class IdadeScanner{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int anoAtual = 2022;

        System.out.println("Informe seu ano de nascimento:");
        int anoNascimento = ler.nextInt();

        int idade =  anoAtual - anoNascimento;

        System.out.printf("Sua idade em %i é %i" + anoAtual + " é: " + idade + " anos.");

    }
}