import javax.swing.JOptionPane;

class Exe0204JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        int num1 = Integer.parseInt(jp.showInputDialog(null,"Insira o primeiro numero: "));
        int num2 = Integer.parseInt(jp.showInputDialog(null,"Insira o segundo numero: "));

        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2); 

        jp.showMessageDialog(null,"Raiz 1: " + raiz1 + "\nRaiz 2: " + raiz2);







    }

    
}
