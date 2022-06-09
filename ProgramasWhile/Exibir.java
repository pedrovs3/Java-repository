class Exibir {
    public static void main(String[] args) {
        String frase = "Desenvolvimento de Sistemas - Turma DS1-M";
        char ch = '\u2588';
        String space = "\t\t\t";
        for(int i= 0; i <=frase.length() +48; i++){
            System.out.print(ch);
        }
        System.out.printf("\n%c %s %s %s %c\n", ch, space, frase, space, ch);
        for(int i= 0; i <=frase.length()+ 48; i++){
            System.out.print(ch);
        }
    }    
}