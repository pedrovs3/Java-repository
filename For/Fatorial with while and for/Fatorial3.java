import java.util.Scanner;

class Fatorial3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        while(true){
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
    
                    System.out.printf("\n%d! = %d\n", n, fat);
                    break;
                } else{
                    System.out.println("\nSó sao aceitos valores positivos");
                }   
            }

            System.out.println("\nDeseja continuar? [Sim/Não]");
            char resp = ler.next().toUpperCase().charAt(0);
            
            if(resp != 'S' && resp != 'Y'){
                System.exit(0);
            }
        }
    }    
}