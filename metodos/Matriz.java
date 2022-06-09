import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        double m[][] = new double[2][2];

        entrada(m);
        System.out.printf(
                "O menor valor da matriz é %.2f\nO maior valor da matriz é %.2f\nA media da matriz é %.2f\nOs valores da matriz são: \n",
                menor(m), maior(m), media(m));
        exibir(m);
    }

    // Este metodo faz a entrada de dados na matriz

    public static void entrada(double m[][]) {
        Scanner ler = new Scanner(System.in);

        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                System.out.print("Digite um numero: ");
                m[line][col] = ler.nextDouble();
            }
        }
    }

    // Esse metodo retonar o menor valor da matriz

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

    // Esse metodo retorna o maior valor da matriz

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

    // Método que retorna a Média da matriz

    public static double media(double m[][]) {
        double somaNums = 0;
        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                somaNums += m[line][col];
            }
        }
        return somaNums / (m[0].length * m.length);
    }

    // Esse metodo faz a exibição dos valores da matriz

    public static void exibir(double m[][]) {
        for (int line = 0; line < m.length; line++) {
            for (int col = 0; col < m[0].length; col++) {
                System.out.println(m[line][col]);
            }
        }
    }
}