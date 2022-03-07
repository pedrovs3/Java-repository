import java.util.Scanner;

class Exe0203Scan {
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o primeiro modulo");
        int mod1 = ler.nextInt();

        System.out.println("Insira o segundo modulo");
        int mod2 = ler.nextInt();

        double modulo = mod1%mod2;

        System.out.println("O modulo entre os dois numeros será: ");
        System.out.print(modulo);





    }
    
}
