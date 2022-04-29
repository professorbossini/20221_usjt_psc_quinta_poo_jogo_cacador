import java.util.Random;
public class TesteRandom {
    public static void main(String[] args) {
        Random gerador = new Random();
        int resultado = gerador.nextInt(3) + 1;
        System.out.println(resultado);
    }
}
