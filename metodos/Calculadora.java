import java.lang.reflect.Array;
import java.util.Scanner;

class Calculador{
    public static Scanner ler = new Scanner(System.in);
    public static void main(String args[]){
        
        double[] values = entrada();
        double n1 = values[0];
        double n2 = values[1];
        
        

        double resultSoma = somar(n1, n2);
        double resultSub = subtrair(n1, n2);
        double resultMulti = multiplicar(n1, n2);
        double resultDiv = dividir(n1, n2);

        System.out.printf("Operações com %.1f e %.1f \nSoma = %.1f \nSubtração = %.1f \nMultiplicação = %.1f \nDivisao = %.1f", n1, n2, resultSoma, resultSub, resultMulti, resultDiv);
    }

    public static double[] entrada(){
        System.out.print("Digite o primeiro valor:");
        double n1 = ler.nextDouble();
        System.out.print("Digite o Segundo valor:");
        double n2 = ler.nextDouble();
        double[] valores = {n1, n2};

        return valores;
    }

    public static double somar(double n1, double n2){
        return(n1 + n2);
    }

    public static double subtrair(double n1, double n2){
        return(n1 - n2);
    }

    public static double multiplicar(double n1, double n2){
        return(n1 * n2);
    }

    public static double dividir(double n1, double n2){
        if(n2 == 0){
            System.out.print("O numero nao pode ser dividido por 0");
            return -1;
        }
        return(n1 / n2);
    }
}