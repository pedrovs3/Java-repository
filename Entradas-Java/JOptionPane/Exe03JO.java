import javax.swing.JOptionPane;

class Exe03JO{
    public static void main(String arg[]){
    JOptionPane jp = new JOptionPane();

    int var1 = Integer.parseInt(jp.showInputDialog(null,"Insira o valor da primeira variavel"));
    int var2 = Integer.parseInt(jp.showInputDialog(null,"Insira o valor da segunda variavel"));

    int cache = var1;
    var1 = var2;
    var2 = cache;


    jp.showMessageDialog(null, "agora o valor da variavel1 é " + var1);
    jp.showMessageDialog(null, "agora o valor da variavel2 é " + var2);
    }
}