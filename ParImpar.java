import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

class ParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = ler.nextInt();

        if (num == 0) {
            System.out.println("O valor é nulo.");    
            return;
        }
        if (num % 2 == 0){
            System.out.println("O valor é par.");
            
        }
        else{
            System.out.println("O valor é impar.");
        }
    }    
}