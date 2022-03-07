import java.util.Scanner;

class Exe06Scan {
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a temperatura em celsius para fazer a conversão para fahrenheit");
        double celsius = ler.nextDouble();

        double fah = (9 * celsius + 160) / 5;
        System.out.println(celsius + " Em fahrenheit é: " + fah);

    }
    
}
