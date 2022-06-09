import java.util.Scanner;

class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor para saber seu fatorial");
        int num = ler.nextInt();
        long fator = 1;

        while(num<0){
            System.out.println("Somente numeros positivos sao aceitos!");
            System.out.println("Digite um valor positivo para saber seu fatorial:");
            num = ler.nextInt();
        }

        if (num>=0){
            for (int i = num; i > 1 ; i--){
                fator *= i;
            }
            System.out.println("O fator de " + num + "! é: " + fator);  
        }
    }    
}