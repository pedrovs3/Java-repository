class Exec{
    static void Ex01(){
        double decimal1 = 2.5;
        double decimal2 = 1.5;

        double soma = decimal1 + decimal2;
        double subtracao = decimal1 - decimal2;
        double multiplicacao = decimal1 * decimal2;
        double divisao = decimal1 / decimal2;
        
        System.out.println("A soma dos valores é: " + soma + "\nA Subtração dos valores é: " + subtracao + "\nA multiplicação dos valores é: " + multiplicacao + "\nA Divisao dos valores é: " + divisao);    
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

        System.out.print("Exponum1: " + valorexpo1 + "\nExponum2: " + valorexpo2 + "\nDivisão: " + divisao + "\nMódulo: " + modulo + "\nRaiz numero1" + raiz1 + "\nRaiz numero 2" + raiz2);
    }

    static void ex03(){
        int var1 = 10;
        int var2 = 20;

        int cache = var1;
        var1 = var2;
        var2 = cache;

        System.out.print("\nA variavel 1 tinha o valor: 10 e após a troca ficou com: " + var1 + "\nJá a variavel 2 tinha o valor: 20 e agora possui: " + var2);
    }

    static void ex04(){
        double compra = 120;
        double desconto = 30;

        double valorDesconto = (compra / 100) * desconto;
        double valorFinal = compra - valorDesconto;
        System.out.print("\nO valor da compra com desconto fica: " + valorFinal);
    }

    static void ex05(){
        double valorDol = 100;
        double valorReal = 5.25;

        double conversao = valorDol * valorReal;
        System.out.print("\nO valor de " + valorDol + " dolares em reais fica: " + conversao);
    }

    static void ex06(){
        int celsius = 20;

        int f = (9 * celsius + 160) / 5;
        System.out.print("\nA temperatura de " + celsius + "°C em Fahreinheit é: " + f + "°F");

    }

    public static void main(String[] args) {
    Ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    ex06();
    }
}