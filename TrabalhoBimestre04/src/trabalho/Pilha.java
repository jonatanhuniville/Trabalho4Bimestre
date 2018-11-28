package trabalho;

public class Pilha {
    
    private Elemento topo;
    
    public boolean isEmpty() {
        return topo == null;
    }
    
    public boolean isFull() {
        return false;
    }
    
    public void push(Object o) throws Exception {
        System.out.println("Adicionando " + o);
        topo = new Elemento(o, topo);
    }

    public Object pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Pilha vazia");
        }
        
        Object o = topo.getValor();
        topo = topo.getAnterior();
        System.out.println("Removendo " + o);
        return o;
    }
    
    public void clear() {
        while (!this.isEmpty()) {
            try {
                this.pop();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void percorrer() {
        Elemento e = topo;
        while (e != null) {
            System.out.println("Valor: " + e.getValor());
            e = e.getAnterior();
        }
    }
}
