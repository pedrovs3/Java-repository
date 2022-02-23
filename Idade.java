import javax.swing.JOptionPane;
import java.lang.Integer;

class Idade {
    public static void main(String args[]) {
    JOptionPane jp = new JOptionPane();

    int anoAtual = 2022;
    int AnoNascimento = Integer.parseInt(jp.showInputDialog(null, "Informe seu ano de nascimento: ")); 

    int anos = anoAtual - AnoNascimento;

    jp.showMessageDialog(null, "Voce tem " + anos + " Anos de idade em " + anoAtual);

    }
}