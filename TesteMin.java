public class TesteMin {
    public static void main(String[] args) {
        System.out.println(Math.min(2, 3));

        int fome = 5;

        System.out.println(Math.min(fome + 1, 10));

        fome = fome + 1 <= 10 ? fome + 1 : 10;
    }
}
