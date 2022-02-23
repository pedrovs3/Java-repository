import java.util.Scanner;

class InputScanner{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = ler.nextLine();

        System.out.println("Seja bem vindo " + nome+ "!");

    }
}