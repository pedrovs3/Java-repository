class Exec3 {
    public static void main(String args[]) {
        int var1 = 10;
        int var2 = 20;
    
        int cache = var1;
        var1 = var2;
        var2 = cache;
    
        System.out.print("\nA variavel 1 tinha o valor: 10 e após a troca ficou com: " + var1 + "\nJá a variavel 2 tinha o valor: 20 e agora possui: " + var2);
        }    
}