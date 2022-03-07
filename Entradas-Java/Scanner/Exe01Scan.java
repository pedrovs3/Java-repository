import java.util.Scanner;

class Exe01Scan{
    public static void main(String arg[]){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int var1 = ler.nextInt();

        System.out.println("Digite o segundo numero");
        int var2 = ler.nextInt();

        double result = (var1 * 3 + 50) - (var2 - 25 /7);
        System.out.println("O resultado e: " + result);


    }
}