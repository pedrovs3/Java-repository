import java.lang.reflect.Array;
import java.util.Scanner;

class Imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite sua Altura: ");
        float altura = ler.nextFloat();
        System.out.print("Digite seu peso: ");
        float peso = ler.nextFloat();

        double imc = peso / (Math.pow(altura, 2));

        String[] niveis = {"Abaixo do peso", "Peso Normal", "Sobrepeso", "Obesidade grau 1", "Obesidade grau 2", "Obesidade grau 3"};
        
        if (imc >=39.9) {
            System.out.print(niveis[5]);
        }
        if (imc > 34.9) {
            System.out.print(niveis[4]);
        }
        if (imc > 29.9) {
            System.out.print(niveis[3]);
        }
        if (imc > 24.9) {
            System.out.print(niveis[2]);
        }
        if (imc > 18.5) {
            System.out.print(niveis[1]);
        }
        if (imc < 18.5) {
            System.out.print(niveis[0]);
        }
        System.out.printf("\nSeu imc é: %.2f", imc);
    }    
}