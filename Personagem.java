public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;
    
    //metódo tem quatro partes
    //1. tipo de retorno
    //2. nome
    //3. lista de parâmetros
    //4. corpo
    void cacar (){
        System.out.println(nome + " caçando...");
    }

    void dormir(){
        System.out.println(nome + " dormindo...");
    }

    void comer(){
        System.out.println(nome + "comendo...");
    }

    int somar(int a, int b){
        return a + b;    
    }
}