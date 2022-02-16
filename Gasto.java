import java.io.Console;

class Gasto{
    public static void main(String args[]) {
        
        Console line = System.console();
        String tempo = line.readLine("Digite por quantas horas voce dirigiu: ");
        String velocidade = line.readLine("Digite a velocidade média durante a viagem: ");

        float distancia = Double.parseDouble(tempo) * Double.parseDouble(velocidade);

        float LITROS_USADOS = distancia / 12;
        LITROS_USADOS = Math.round(LITROS_USADOS);

        System.out.println("A velocidade média do veículo é: " + velocidade + "KM/H" + "\nO tempo gasto foi de: " + tempo + " Horas" + "\nA distância percorrida foi: " + distancia +"KM" + "\nA quantidade de litros gasto na viagem foi de: " + LITROS_USADOS + "L");
    }
}

