import java.util.Scanner;

class Primo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = 0;

        while (true) {
            System.out.println("Numero: ");
            n = ler.nextInt();
            if(n >= 2){
                break;
            }
        }

        for (int i= 2; i <= n/2; i++ ){
            if(n % i == 0){
                System.out.printf("O numero nao é primo pois é divisivel por %s", i);
                break;
            }
            System.out.print("O numero é primo");
        }
    }
}