import javax.swing.JOptionPane;
class Exe06JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();
        double celsius = Double.parseDouble(jp.showInputDialog(null,"Insira a temperatura em celsius para converter em fahrenheit"));

        double fah = (9 * celsius + 160) / 5;

        jp.showMessageDialog(null, celsius + " em fahrenheit é: " + fah);
        



    }
    
}
