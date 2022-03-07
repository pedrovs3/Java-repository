import javax.swing.JOptionPane;

class Exe0203JO{
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

    String mod1Txt = jp.showInputDialog(null, "Insira o primeiro modulo:");
    String mod2Txt = jp.showInputDialog(null,"Insira o segundo modulo:");

    int mod1 = Integer.parseInt(mod1Txt);
    int mod2 = Integer.parseInt(mod2Txt);

    double modulo = mod1%mod2;

    jp.showMessageDialog(null,"O valor do modulo sera: " + modulo);


    }
}
