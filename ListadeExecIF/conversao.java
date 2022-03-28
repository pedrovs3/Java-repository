import java.util.Scanner;

class Conversao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor em Metros: ");
        float m = ler.nextFloat();

        if (m >= 1){
            float km = m / 1000;
            System.out.printf("Esse valor em km é: %.3f km\n", km);

            float hm = m / 100;
            System.out.printf("Esse valor em hm é: %.2f hm\n", hm);

            float dam = m / 10;
            System.out.printf("Esse valor em dam é: %.2f dam\n", dam);

            System.out.printf("O valor em M é: %fM\n", m);

            float dm = m * 10;
            System.out.printf("Esse valor em dm é: %.2f dm\n", dm);

            float cm = m * 100;
            System.out.printf("Esse valor em cm é: %fcm \n", cm);

            float mm = m * 1000;
            System.out.printf("Esse valor em mm é: %fmm \n", mm);
        }
        else{
            System.out.print("O valor nao foi digitado em metros!");
        }
    }    
}
