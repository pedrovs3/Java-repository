import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double m[][] = new double[2][2];

        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                System.out.print("Digite um numero: ");
                m[line][col] = ler.nextInt();
            }
        }

        System.out.printf("O menor valor da matriz é %s\n", menor(m));
        System.out.printf("O maior valor da matriz é %s\n", maior(m));
        System.out.printf("A media da matriz é %s\n", media(m));
        System.out.print("Os valores da matriz são: \n");
        exibir(m);
    }

    public static double menor(double m[][]) {
        double MenorNumero = m[0][0];
        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                if (MenorNumero > m[line][col]) {
                    MenorNumero = m[line][col];
                }
            }
        }

        return MenorNumero;
    }

    public static double maior(double m[][]) {
        double MaiorNumero = m[0][0];
        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                if (MaiorNumero < m[line][col]) {
                    MaiorNumero = m[line][col];
                }
            }
        }

        return MaiorNumero;
    }

    public static double media(double m[][]) {
        double somaNums = 0;
        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                somaNums += m[line][col];
            }
        }
        return somaNums / (m[0].length + m.length);
    }

    public static void exibir(double m[][]) {
        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                System.out.println(m[line][col]);
            }
        }
    }
}