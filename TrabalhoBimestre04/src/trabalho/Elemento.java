package trabalho;

public class Elemento {
    
    private Elemento anterior;
    private Object valor;
    
    public Elemento(Object v, Elemento e) {
        anterior = e;
        valor = v;
    }
    
    public Elemento getAnterior() {
        return anterior;
    }
    
    public Object getValor() {
        return valor;
    }
    
}
