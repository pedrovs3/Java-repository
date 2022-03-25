import java.util.Scanner;

class For {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        for (int i = 20; i <= 50; i+=1){
            System.out.print(i + ", ");
        }
        
        System.out.println("\nDeseja continuar? [Sim/Nao]");
        String cont = ler.next().
                          substring(0,1).
                          toUpperCase();
        
        if (cont.equals("S")) {
            System.out.print("Mais quantos valores? ");
            int val = ler.nextInt();

            for (int i = 50; i <= 51 -1 + val; i+=1){
                System.out.print(i + ", ");
            }
        } else {
            System.out.print("Programa Finalizado.");
        }
    }
}
