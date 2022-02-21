import javax.swing.JOptionPane;

class Input{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        String nome = jp.showInputDialog(null, "Insira o seu Nome: ");
        jp.showMessageDialog(null, "Seja bem vindo " + nome + "!");        
    }
}