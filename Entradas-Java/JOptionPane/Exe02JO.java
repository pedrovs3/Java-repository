import javax.swing.JOptionPane;

class Exe02JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        int valor1 = Integer.parseInt(jp.showInputDialog(null,"Insira o primeiro valor"));
        int valor2 = Integer.parseInt( jp.showInputDialog(null,"Insira o segundo valor"));

        double valor1expo = Math.pow(valor1,5);
        double valor2expo = Math.pow(valor2,5);

        jp.showMessageDialog(null, "O valor do primeiro numero inserido potencializado é: " + valor1expo);
        jp.showMessageDialog(null, "O valor do segundo numero inserido potencializado é: " + valor2expo);

    } 
}
