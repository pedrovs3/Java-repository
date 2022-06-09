import java.util.Scanner;

class Euler {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.print("Digite um numero inteiro positivo:");
            Float n = (float) ler.nextInt();
            if(n > 0){
                Float e = (float) 1 + (1/n);
                e = (float) Math.pow(e, n);
                System.out.println(e);
            }

            System.out.println("Deseja Continuar? [S/N]");
            String resp = ler.next().toUpperCase().substring(0,1);
            if(!resp.equals("S")){
                System.out.print("Encerrando o programa.");
                System.exit(0);
            }
        } 
    }    
}