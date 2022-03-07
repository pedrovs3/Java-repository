import javax.swing.JOptionPane;

class Exe04JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        int compra = Integer.parseInt(jp.showInputDialog(null,"Insira o valor da compra"));
        int desconto = Integer.parseInt(jp.showInputDialog(null,"Insira o valor do desconto"));

        double descontagem = (compra/100) * desconto;
        double valor = descontagem - compra;

        jp.showMessageDialog(null, "O valor final da compra será: " + valor);


    }
    
}
