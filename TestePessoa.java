import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite um nome");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));

        Pessoa p = new Pessoa();
       

        //p.idade = 11;

        //p.nome = nome;
        p.setNome(nome);
        
        
        //p.idade = 17;
        p.setIdade(35);
        p.setIdade(17);

        System.out.printf(
            "Nome: %s\nIdade: %d\n",
            p.getNome(),
            p.getIdade()
        );
    }
}
