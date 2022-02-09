class Exec{
    static void Ex01(){
        double decimal1 = 2.5;
        double decimal2 = 1.5;

        double soma = decimal1 + decimal2;
        double subtracao = decimal1 - decimal2;
        double multiplicacao = decimal1 * decimal2;
        double divisao = decimal1 / decimal2;
        
        System.out.println("A soma dos valores é: " + soma + " A Subtração dos valores é: " + subtracao + " A multiplicação dos valores é: " + multiplicacao + " A Divisao dos valores é: " + divisao);    
    }

    static void ex02(){
        int num1 = 5;
        int num2 =  10;

        double valorexpo1 = Math.pow(num1, 5);
        double valorexpo2 = Math.pow(num2, 5);

        int divisao = num1 / num2;
        int modulo = num1 % num2;
        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);

        System.out.println("Exponum1" + valorexpo1 + "Exponum2" + valorexpo2 + "divisão" + divisao + "modulo" + modulo + "Raiz numero1" + raiz1 + "Raiz numero 2" + raiz2);
    }

    static void ex03(){
        
    }

    public static void main(String[] args) {
    Ex01();
    ex02();

    }
}