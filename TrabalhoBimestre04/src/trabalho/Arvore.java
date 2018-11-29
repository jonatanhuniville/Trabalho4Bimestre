package trabalho;

public class Arvore<T extends Comparable<T>> {
	public No<T> raiz;
	public int contador = 0;
	
	public void adiciona(T valor) {
        System.out.println("Adicionando um elemento: " + valor);
		if (this.raiz == null) {
			this.raiz = new No<T>(valor);
		} else {
			this.adiciona(this.raiz, valor);
		}
	}
	
	private void adiciona(No<T> pai, T valor) {
		contador++;
		if (valor.compareTo(pai.valor) >= 0) {
			contador++;
			if (pai.direita == null) {
				No<T> no = new No<T>(valor);
				no.pai = pai;
				pai.direita = no;
			} else {
				this.adiciona(pai.direita, valor);
			}
		} else {
			contador++;
			if (pai.esquerda == null) {
				No<T> no = new No<T>(valor);
				no.pai = pai;
				pai.esquerda = no;
			} else {
				this.adiciona(pai.esquerda, valor);
			}
		}
	}
        
        public void remove(No<T> no) {
            System.out.println("Removendo um elemento: " + no);
            contador++;
            if (no.esquerda != null) {
                this.remove(no.esquerda);
            }
            
            contador++;
            if(no.direita != null) {
                this.remove(no.direita);
            }
            
            contador++;
            if (no.pai == null) {
                this.raiz = null;
            } else {
            	contador++;
                if (no.pai.esquerda == no) {
                    no.pai.esquerda = null;
                } else {
                    no.pai.direita = null;
                }
            }
        }
        
        public void percorrer(No<T> no) {
        	contador++;
            if (no != null) {
                System.out.println("Valor: " + no.valor);
                percorrer(no.esquerda);
                percorrer(no.direita);
            }
        }
        
        public No<T> localizar (T valor ) {
            return this.localizar(this.raiz, valor);
        }
        
        private No<T> localizar(No<T> no, T valor) {
        	contador++;
            if (no != null) {
            	contador++;
                if (no.valor.equals(valor)) {
                    return no;
                }
                
                No<T> aux = localizar (no.esquerda, valor);
                contador++;
                if (aux != null) {
                    return aux;
                }
                
                aux = localizar (no.direita, valor);
                contador++;
                if (aux != null) {
                    return aux;
                }
            }
            return null;
        }
}