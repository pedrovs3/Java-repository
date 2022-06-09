import java.util.Scanner;

class ParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true){
            while(true){
                System.out.println("Digite um valor: ");
                int num = ler.nextInt();

                if (num == 0) {
                    System.out.println("O valor é nulo.");    
                    break;
                }
                if (num % 2 == 0){
                    System.out.println("O valor é par.");
                    break;
                }
                else{
                    System.out.println("O valor é impar.");
                    break;
                }
            }
            System.out.print("Deseja Continuar? [S/N]");
            String op = ler.next().toUpperCase().substring(0,1);

            if(!op.equals("S")){
                System.exit(0);
            }
        }
    }    
}