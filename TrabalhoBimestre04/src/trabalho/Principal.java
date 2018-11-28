package trabalho;

public class Principal<T extends Comparable<T>> {
    
    public Arvore<T> arvore = new Arvore<T>();
    public Pilha pilha = new Pilha();
    
    public static void main(String args[]) throws Exception{
        Principal Principal = new Principal();
        Principal.start();
    }
    
    public void start() throws Exception{
        T raiz = null;
        arvore.adiciona(raiz);
        
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.percorrer();
    }
}
