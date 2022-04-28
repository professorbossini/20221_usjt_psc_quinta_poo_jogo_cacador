//alta coesão
//você deseja que a sua classe seja altamente coesa
public class Personagem{
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    
    //metódo tem quatro partes
    //1. tipo de retorno
    //2. nome
    //3. lista de parâmetros
    //4. corpo
    void cacar(){
        if (energia >= 2){
            System.out.println(nome + " caçando...");
            //energia = energia - 2;
            energia -= 2;
            //energia--;
            //energia--;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = Math.min (fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void dormir(){
        System.out.println(nome + " dormindo...");
    }

    void comer(){
        System.out.println(nome + " comendo...");
    }

    int somar(int a, int b){
        return a + b;    
    }
}