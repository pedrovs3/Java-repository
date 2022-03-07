import javax.swing.JOptionPane;

class Exe0203JO{
    public static void main(String arg[]){
    JOptionPane jp = new JOptionPane();

    int mod1 = Integer.parseInt(jp.showInputDialog(null, "Insira o primeiro modulo:")); 
    int mod2 =Integer.parseInt( jp.showInputDialog(null,"Insira o segundo modulo:"));

    double modulo = mod1 % mod2;

    jp.showMessageDialog(null,"O valor do modulo sera: " + modulo);

    }
}
