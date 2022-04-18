import java.util.Scanner;

class Formas {
    public static Scanner ler = new Scanner(System.in);
    public static double n1 = 0;
    public static double n2 = 0;
    public static double pi = 3.14;
    public static void main(String[] args) {
        selecionar(escolher());
    }

    public static int escolher(){
        System.out.print("Deseja saber a área de qual forma?\n[1] Circulo\n[2]Retângulo\n[3]Quadrado\n[4]Triangulo\n");
        int escolha = ler.nextInt();
        return escolha;
    }

    public static void selecionar(double escolha){
        if (escolha == 1) {
            System.out.print("Digite o Raio da figura: ");
            n1 = ler.nextDouble();
            double area = areaCirculo(n1, pi);
            System.out.printf("%f", area);
        } else{
            if (escolha == 2){
                System.out.print("Digite a base do retângulo: ");
                n1 = ler.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                n2 = ler.nextDouble();

                double area = areaRetangulo(n1, n2);
                System.out.print(area);
            } else{
                if (escolha == 3) {
                System.out.print("Digite o lado do quadrado: ");
                n1 = ler.nextDouble();

                double area = areaQuadrado(n1);
                System.out.print(area);   
                } else{
                    System.out.print("Digite a altura do Triângulo: ");
                    n1 = ler.nextDouble();
                    System.out.print("Digite a base do Triângulo");
                    n2 = ler.nextDouble();

                    double area = areaTriangulo(n1, n2);
                    System.out.print(area);  
                }
            }
        }
    }
    
    public static double areaCirculo(double n1, double pi) {
        return (pi * (Math.pow(n1, 2)));
    }

    public static double areaRetangulo(double n1, double n2){
        return (n1 * n2);
    }

    public static double areaQuadrado(double n1){
        return (Math.pow(n1, 2));
    }

    public static double areaTriangulo(double n1, double n2) {
        return((n1 * n2) / 2);
    }
}