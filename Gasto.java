class Gasto{
    public static void main(String args[]) {
        double tempo = 4;
        int velocidade = 100;

        double distancia = tempo * velocidade;

        double LITROS_USADOS = distancia / 12;
        LITROS_USADOS = Math.round(LITROS_USADOS);

        System.out.println("A velocidade média do veículo é: " + velocidade + "KM/H" + "\nO tempo gasto foi de: " + tempo + " Horas" + "\nA distância percorrida foi: " + distancia +"KM" + "\nA quantidade de litro gasto na viagem foi de: " + LITROS_USADOS + "L");
    }
}

