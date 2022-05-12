//alta coesão
//você deseja que a sua classe seja altamente coesa
public class Personagem{
    String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    
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
        //fome = 8
        //Math.min (8 + 1, 10) = 9
        //fome = 9
        //Math.min (9 + 1, 10) = 10
        //fome = 10
        //Math.min (10 + 1, 10) = 10
        fome = Math.min (fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void dormir(){
        if (sono >= 1){
            System.out.println(nome + " dormindo...");
            sono--;
            energia = energia + 1 <= 10 ? energia + 1 : 10;          
        }
        else{
            System.out.println (nome + " sem sono...");
        }
    }

    void comer(){
        if (fome >= 1){
            System.out.println(nome + " comendo...");
            --fome;
            //fome = fome - 1;
            energia = Math.min (energia + 1, 10);
        }
        else{
            System.out.println(nome + " sem fome...");
        }
    }

    int somar(int a, int b){
        return a + b;    
    }
}