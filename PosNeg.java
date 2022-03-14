import java.util.Scanner;

class PosNeg{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int num = ler.nextInt();

        if (num > 0 ) {
            System.out.println("Este valor é inteiro.");
        } 
        if (num < 0 ) {
            System.out.println("Este valor é negativo.");
        }
        if (num == 0 ){
            System.out.print("Este valor é zero.");
        }
    }
}