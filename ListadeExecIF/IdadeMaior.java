import java.util.Scanner;

class IdadeMaior{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        int idade = ler.nextInt();

        if(idade >= 0 && idade <= 150){
            if (idade >= 18){
                System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("\n        Maior de Idade.");
                System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
            else{
                System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("\n        Menor de Idade.");
                System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }

        else{
            System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("\n        Idade Inválida!");
            System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}