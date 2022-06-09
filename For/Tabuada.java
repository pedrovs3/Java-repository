import java.util.Scanner;

class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero para saber sua tabuada: ");
        int num = ler.nextInt();

        for(int i = 0; i<3 ; i++){
            
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", num , j , num*j);
            }
            num++;
            System.out.println();
        }
    }
}