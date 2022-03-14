import java.util.Scanner;

class Igualdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = ler.nextInt();

        if (num1 > num2 || num2 > num1){
            if (num1 > num2){
                System.out.println("O primeiro valor é maior");
            }
            else{
                System.out.println("O segundo valor é maior");
            }
        }
        else{
            System.out.println("Os valores sao iguais");
        }
    }    
}