import javax.swing.JOptionPane;

class Exe0204JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        int modulo1 = Integer.parseInt(jp.showInputDialog(null,"Insira o primeiro modulo: "));
        int modulo2 = Integer.parseInt(jp.showInputDialog(null,"Insira o segundo modulo: "));

        double mod = modulo1%modulo2;

        jp.showMessageDialog(null,"O modulo entre os dois numeros é: " + mod);







    }

    
}
