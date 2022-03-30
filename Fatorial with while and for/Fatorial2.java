import java.util.Scanner;

class Fatorial2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("Informe um numero positivo: ");
            int n = ler.nextInt();
            long fat = n;
            
            if(n>=0){
                if(n == 0){
                    fat++;
                }

                for(int i=2;i<n; i++){
                    fat *= i;
                }

                System.out.printf("%d! = %d", n, fat);
                System.out.print("\nDeseja continuar? [Sim/Não]");
                String rep = ler.next().toUpperCase().substring(0,1);
                
                if(rep.equals("N")){
                    System.exit(0);
                }
                
                while (rep.equals("S") && n < 0){
                    System.out.println("Informe um numero positivo: ");
                    n = ler.nextInt();
                    System.out.println("\nDeseja continuar? [Sim/Não]");
                    rep = ler.next().toUpperCase().substring(0,1);
                }
            }
            System.out.println("\nSó sao aceitos valores positivos");
        }
    }    
}