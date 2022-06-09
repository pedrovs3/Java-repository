import java.util.Scanner;

class Fatorial2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        while (true){
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
                    break;

                } else{
                    System.out.println("\nSó sao aceitos valores positivos\n");
                }   
            }

            System.out.println("\nDeseja continuar? [Sim/Não]");
            String resp = ler.next().toUpperCase().substring(0, 1);
                    
            if(!resp.equals("SIM") && !resp.equals("YES")){
                System.exit(0);
            }
        }
    }    
}