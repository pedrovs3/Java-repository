import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o termo da série de fibonacci");
        int range = ler.nextInt();
        if (range == 1) {
            System.out.print("1");
            System.exit(0);
        }

        int n1 = 1;
        int n2 = 1;

        if(n1 == 1 || n2 == 1 ){
            for (int a = 0; a < 2; a++) {
                System.out.print("1 ");
            }
        }
        for(int i = 1;i <= range - 2; i++){
            int termo = n1 + n2;
            n1 = n2;
            n2 = termo; 
            System.out.printf("%s ", termo); 
            System.out.printf("phi = %f", (double)n2/n1);
        }
    }    
}