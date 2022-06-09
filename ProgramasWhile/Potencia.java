import java.util.Scanner;

class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1;
        int expo;

        while (true){
            System.out.println("Digite o numero para base: ");
            n1 = ler.nextInt();
            System.out.println("Digite o numero para o expoente: ");
            expo = ler.nextInt();

            if (n1>= 0 && expo >=0) {
                break;
            }
        }

        long potencia = n1;

        if(expo == 0 ){
            System.out.printf("%d ^ %d = 1", n1, expo);
            System.exit(0);
        }

        for(int i = 1; i < expo; i++){
            potencia *= n1;
        }
        System.out.printf("%d ^ %d = %d", n1, expo, potencia);
    }    
}