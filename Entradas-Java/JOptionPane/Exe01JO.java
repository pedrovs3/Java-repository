import javax.swing.JOptionPane;

class Exe01JO{
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        String var1Txt = jp.showInputDialog(null, "insira o primeiro valor");
        int var1 = Integer.parseInt(var1Txt);

        String var2Txt = jp.showInputDialog(null, "insira o segundo valor");
        int var2 = Integer.parseInt(var2Txt);

        double result = (var1 * 3 + 50) - (var2 - 25 /7);

        jp.showMessageDialog(null, "o resultado total é: " + result);

    }
}