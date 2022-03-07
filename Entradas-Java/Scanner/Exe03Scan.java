import java.util.Scanner;

class Exe03Scan {
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor da primeira variavel: ");
        int var1 = ler.nextInt();

        System.out.println("Insira o valor da segunda variavel: ");
        int var2 = ler.nextInt();

        int cache = 0;
        
        cache = var1;
        var1 = var2;
        var2 = cache;

        System.out.println("Agora o valor da variavel 1 é: " + var1 + " e o valor da variavel 2 é: " + var2);
        




    }
    
}
