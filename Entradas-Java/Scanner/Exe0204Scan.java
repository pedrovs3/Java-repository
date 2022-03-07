import java.util.Scanner;

class Exe0204Scan {
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int val1 = ler.nextInt();

        System.out.println("Insira outro valor: ");
        int val2 = ler.nextInt();

        double resultado1 = Math.sqrt(val1);
        double resultado2 = Math.sqrt(val2);

        System.out.println("A raiz quadrada do primeiro numero é: " + resultado1);
        System.out.println("A raiz quadrada do segundo numero é: " + resultado2);
        
    }
    
}
