import javax.swing.JOptionPane;

class Exe0202JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        int div1 = Integer.parseInt(jp.showInputDialog(null,"Insira o primeiro valor para dividir"));
        int div2 = Integer.parseInt(jp.showInputDialog(null,"Insira o segundo numero para ocorrer a divisão"));

        int resultado = div1 / div2;

        jp.showMessageDialog(null,"O valor da divisão entre os dois numeros é: " + resultado);


    }

    
}
