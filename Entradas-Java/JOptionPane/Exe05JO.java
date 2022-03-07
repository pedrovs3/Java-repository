import javax.swing.JOptionPane;

class Exe05JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        double valDolar = Double.parseDouble(jp.showInputDialog(null,"Insira o valor em dolares para fazermos a conversão para reais"));

        double valReal = 5.50;
        double convert = valReal * valDolar;

        jp.showMessageDialog(null,"O valor em dolares convertido em reais é: " + convert);

    }
    
}
