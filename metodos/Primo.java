import java.util.ArrayList;
import java.util.Scanner;

class Primo {
    public static int entrada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor inteiro maior que 1:");
        int n = input.nextInt();

        return n;
    }

    public static ArrayList divisores(int n, ArrayList<Integer> lista) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                // System.out.printf("O numero nao é primo pois é divisivel por %s\n", i);
                lista.add(i);
            }
        }   

        return lista;
    }

    public static void exibir(ArrayList<Integer> lista) {
        if (lista.size() < 1) {
            System.out.println("O numero é primo");
        } else {
            System.out.println("O numero é divisivel por: ");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.size() >= 1) {
                    System.out.println(lista.get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = entrada();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        divisores(n, lista);

        exibir(lista);
    }
}