import java.util.Scanner;

class Autenticacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String user = "Pedrovs3";
        int password = 123;
        int i = 0;

        while (true) {
            while (i < 3) {
                System.out.println("Digite o Usuário: ");
                String userInsert = ler.next();

                System.out.println("Digite a Senha do usuário: ");
                int passInsert = ler.nextInt();

                if (user.equals(userInsert) && passInsert == password) {
                    System.out.printf("Bem vindo %s!", user);
                    System.exit(0);
                } else {
                    i++;
                    if(user.equals(userInsert)){
                        System.out.println("Senha incorreta.");
                    } else{
                        System.out.println("Usuário incorreto.");
                    }
                    System.out.println("Tente Novamente!");
                }
            }
            System.out.println("=================================");
            System.out.println("Deseja criar um novo usuário ? [S/N]");
            String resp = ler.next().substring(0, 1).toUpperCase();
            if (resp.equals("S")) {
                System.out.println("Digite o novo usuário: ");
                user = ler.next();
                System.out.println("Digite a nova Senha: ");
                password = ler.nextInt();
                i = 0;
            } if  (!resp.equals("S")) {
                System.exit(0);
            }
        }
    }
}