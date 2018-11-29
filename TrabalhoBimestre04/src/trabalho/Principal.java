package trabalho;

import java.util.Random;

public class Principal<T extends Comparable<T>> {
    
    public Arvore<T> arvore = new Arvore<T>();
    public Pilha pilha = new Pilha();
    
    public static void main(String args[]) throws Exception{
        Principal Principal = new Principal();
        Principal.start();
    }
    
    public void start() throws Exception{
    	
    	int vetor10[] = new int[10];
    	int vetor20[] = new int[20];
    	int vetor30[] = new int[30];
    	int vetor40[] = new int[40];
    	int vetor50[] = new int[50];
    	int vetor60[] = new int[60];
    	int vetor70[] = new int[70];
    	int vetor80[] = new int[80];
    	int vetor90[] = new int[90];
    	int vetor100[] = new int[100];
    	
    	vetor10 = populateArray(vetor10);
    	vetor20 = populateArray(vetor20);
    	vetor30 = populateArray(vetor30);
    	vetor40 = populateArray(vetor40);
    	vetor50 = populateArray(vetor50);
    	vetor60 = populateArray(vetor60);
    	vetor70 = populateArray(vetor70);
    	vetor80 = populateArray(vetor80);
    	vetor90 = populateArray(vetor90);
    	vetor100 = populateArray(vetor100);
    	
    	for (int i=0; i<vetor10.length; i++) {
    		arvore.adiciona((T) Integer.toString(vetor10[i]));
    	}	
    		
    	System.out.println("Total de operções na árvore: " + arvore.contador);
    	
    	for (int i=0; i<vetor10.length; i++) {
    		pilha.push(vetor10[i]);
    	}
    	
    	System.out.println("Total de operções na pilha: " + pilha.contador);
    	
    	arvore.localizar((T) Integer.toString(vetor10[5]));
    	
//        T raiz = null;
//        arvore.adiciona(raiz);
//        
//        pilha.push(1);
//        pilha.push(2);
//        pilha.push(3);
//        pilha.percorrer();
    }
    
    public int[] populateArray (int array[]) {
    	Random random = new Random();

    	for (int i=0; i<array.length; i++) {
    		array[i] = random.nextInt(100);
    	}
    	
    	return array;
    }
}
