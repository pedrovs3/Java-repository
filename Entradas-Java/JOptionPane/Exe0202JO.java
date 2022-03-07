import javax.swing.JOptionPane;

class Exe0202JO {
    public static void main(String arg[]){
        JOptionPane jp = new JOptionPane();

        String div1txt = jp.showInputDialog(null,"Insira o primeiro valor para dividir");
        String div2txt = jp.showInputDialog(null,"Insira o segundo numero para ocorrer a divisão");

        int div1 = Integer.parseInt(div1txt);
        int div2 = Integer.parseInt(div2txt);

        int resultado = div1 / div2;

        jp.showMessageDialog(null,"O valor da divisão entre os dois numeros é: " + resultado);


    }

    
}
