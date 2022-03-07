import java.util.Scanner;

class Exe02Scan {
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int val1 = ler.nextInt();

        System.out.println("Digite o segundo valor");
        int val2 = ler.nextInt();

        System.out.println("Digite o expoente para potencializar os valores");
        int expo = ler.nextInt();

        double val1Expo = Math.pow(val1, expo);
        double val2Expo = Math.pow(val2, expo);

        System.out.println("O primeiro valor potencializado pelo numero " + expo + " é: " + val1Expo);
        System.out.println("O segundo valor potencializado pelo numero" + expo + " é: " + val2Expo);
    }
    
}
