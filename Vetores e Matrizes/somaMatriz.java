import java.util.Scanner;

class somaMatriz {
    public static int[][] somaMatrizes(int a[][], int b[][], int c[][]) {
        for (int linha = 0; linha < a.length; linha++) {
            for (int col = 0; col < a[0].length; col++) {
                c[linha][col] = a[linha][col] + b[linha][col];
            }
        }
        return c;
    }

    public static void exibir(int c[][]) {
        for (int linha = 0; linha < c.length; linha++) {
            for (int col = 0; col < c[0].length; col++) {
                System.out.printf("Linha %s coluna %s = %s\n", linha, col, c[linha][col]);
            }
        }
    }

    public static int[][] entrada(int mat[][]) {
        Scanner input = new Scanner(System.in);

        for (int linha = 0; linha < mat.length; linha++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.printf("Digite o valor da %s linha e da %s coluna:", linha + 1, col + 1);
                mat[linha][col] = input.nextInt();
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        return mat;
    }

    public static void main(String[] args) {
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];

        A = entrada(A);
        B = entrada(B);

        int C[][] = new int[2][2];
        exibir(somaMatrizes(A, B, C));
    }
}