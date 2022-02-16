class Exec4 {
    public static void main(String args[]) {
        double compra = 120;
        double desconto = 30;

        double valorDesconto = (compra / 100) * desconto;
        double valorFinal = compra - valorDesconto;
        System.out.print("\nO valor da compra com desconto fica: " + valorFinal);
    }
}