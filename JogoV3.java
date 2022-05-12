public class JogoV3 {
    public static void main(String[] args) {
        Personagem p = new Personagem();
        p.nome = "Caçador";
        while(true){
            p.cacar();
            p.cacar();
            p.cacar();
        }
    }
}
