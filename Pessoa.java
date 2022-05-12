public class Pessoa {
    private String nome;
    private int idade;
    private int altura;

    //métodos de acesso e modificadores
    //atribuir um valor à variável nome
    //setter para a variável nome
    public void setNome(String n){
        this.nome = n;
    }

    //setter para a variável idade
    public void setIdade(int idade){
        if (idade >= 18)
            this.idade = idade;
        else
            this.idade = 18;
    }

    //getter para a variável nome
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return idade;
    }


}
