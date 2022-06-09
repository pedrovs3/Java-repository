import java.util.Scanner;


class For {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for (int i = 20; i <= 50; i+=1){
            System.out.println(i);
            
        }
        
        System.out.println("\nDeseja continuar? [1(Sim)/2(Nao)]");
        Short cont = ler.nextShort();

        if (cont == 1) {
            System.out.print("Mais quantos valores? ");
            int val = ler.nextInt();

            for (int i = 50; i <= 51 -1 + val; i+=1){
                System.out.print(i + ", ");
            }
        }
        else{
            System.out.print("Programa Finalizado.");
        }
    }
}