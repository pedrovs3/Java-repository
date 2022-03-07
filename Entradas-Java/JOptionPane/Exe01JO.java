import javax.swing.JOptionPane;

class Exe01JO{
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        String num1txt = jp.showInputDialog(null, "insira o primeiro valor");
        int num1 = Integer.parseInt(num1txt);

        String num2txt = jp.showInputDialog(null, "insira o segundo valor");
        int num2 = Integer.parseInt(num2txt);

        double soma = num1 + num2;
        double div = num1 / num2;
        double multi = num1 * num2;
        double sub = num1 - num2;

        jp.showMessageDialog(null, "soma: " + soma + "\n Divisão: " + div + "\nmultiplição:" + multi + "\n subtração:" + sub);

    }
}
