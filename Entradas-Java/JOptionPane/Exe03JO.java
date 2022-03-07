import javax.swing.JOptionPane;

class Exe03JO{
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

    String var1txt = jp.showInputDialog(null,"Insira o valor da primeira variavel");
    String var2txt = jp.showInputDialog(null,"Insira o valor da segunda variavel");

    int cache = 0;
    int var1 = Integer.parseInt(var1txt);
    int var2 = Integer.parseInt(var2txt);

    cache = var1;
    var1 = var2;
    var2 = cache;


    jp.showMessageDialog(null, "agora o valor da variavel1 é " + var1 + " inves de " + var1txt);
    jp.showMessageDialog(null, "agora o valor da variavel2 é " + var2 + " inves de " + var2txt);


    }
}