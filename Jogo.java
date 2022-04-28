import java.util.Scanner;
public class Jogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //1. construir um objeto do tipo Personagem
        //variável de referência
        // Personagem p;
        // p = new Personagem();
        Personagem p = new Personagem();
        //2. Configurar um nome para esse objeto
        System.out.println("Qual o nome do seu personagem?");
        p.nome = leitor.next();
        //3. Exibir esse nome
        System.out.println("O nome do seu personagem é: " + p.nome);
    }
}
