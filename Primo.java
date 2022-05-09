import java.util.ArrayList;
import java.util.Scanner;

class Primo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int n = input.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0){
                //System.out.printf("O numero nao é primo pois é divisivel por %s\n", i);
                lista.add(i);
            }
        }

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}