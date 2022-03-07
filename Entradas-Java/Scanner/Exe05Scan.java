import java.util.Scanner;

class Exe05Scan {
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);


        System.out.println("Insira o valor em dolares para fazer a conversão em reais");
        double valDolar = ler.nextDouble();

        double valReal = 5.50;

        double convert = valReal * valDolar;
        System.out.println("A conversão de dolar pare reais será: " + convert);
    }
    
}
