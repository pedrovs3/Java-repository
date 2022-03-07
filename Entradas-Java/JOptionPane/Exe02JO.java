import javax.swing.JOptionPane;

class Exe02JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        String valor1Txt = jp.showInputDialog(null,"Insira o primeiro valor");
        String valor2Txt = jp.showInputDialog(null,"Insira o segundo valor");
        String expoTxt = jp.showInputDialog(null,"Insira o expoente desejado");

        int valor1 = Integer.parseInt(valor1Txt);
        int valor2 = Integer.parseInt(valor2Txt);
        int expo = Integer.parseInt(expoTxt);

        double valor1expo = Math.pow(valor1,expo);
        double valor2expo = Math.pow(valor2,expo);

        jp.showMessageDialog(null, "O valor do primeiro numero inserido potencializado é: " + valor1expo);
        jp.showMessageDialog(null, "O valor do segundo numero inserido potencializado é: " + valor2expo);
        






    }

    
}
