import java.util.Scanner;

class Exe01Scan{
    public static void main(String arg[]){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int var1 = ler.nextInt();

        System.out.println("Digite o segundo numero");
        int var2 = ler.nextInt();

        double soma = var1 + var2;
        double multi = var1 * var2;
        double sub = var1 - var2;
        double div = var1 / var2;
        
        System.out.println("Soma: " + soma + "\n Subtração: " + sub + "\nMultiplicação: " + multi + "\n Divisão: " + div);
    }
}
