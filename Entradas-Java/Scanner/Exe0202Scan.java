import java.util.Scanner;

class Exe0202Scan{
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor para dividir: ");
        int val1 = ler.nextInt();

        System.out.println("Digite o segundo valor para ocorrer a divisão: ");
        int val2 = ler.nextInt();

        int result = val1 / val2;

        System.out.println("O resultado da divisão entre os dois numeros foi: " + result);

    }
}