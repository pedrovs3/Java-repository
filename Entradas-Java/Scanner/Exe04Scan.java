import java.util.Scanner;

class Exe04Scan {
    public static void main(String arg[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor da compra");
        int compra = ler.nextInt();

        System.out.println("Insira o valor do desconto");
        int desconto = ler.nextInt();

        double descontagem = (compra/100) * desconto;
        double compraReal = descontagem - compra;

        System.out.println("O valor real da compra sera: " + compraReal);
        


    }

    
}
