import java.util.Scanner;

class Dez {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero:");
        float num = ler.nextFloat();

        if (num > 10) {
            System.out.println("Este valor é maior que 10");
        }
        if (num < 10){
            System.out.println("Este valor é menor que 10");
        }
        if (num == 10) {
            System.out.println("Este valor é 10");
        }
    }    
}