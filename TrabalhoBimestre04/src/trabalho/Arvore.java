package trabalho;

public class Arvore<T extends Comparable<T>> {
	public No<T> raiz;
	
	public void adiciona(T valor) {
            System.out.println("Adicionando um elemento: " + valor);
		if (this.raiz == null) {
			this.raiz = new No<T>(valor);
		} else {
			this.adiciona(this.raiz, valor);
		}
	}
	
	private void adiciona(No<T> pai, T valor) {
		if (valor.compareTo(pai.valor) >= 0) {
			if (pai.direita == null) {
				No<T> no = new No<T>(valor);
				no.pai = pai;
				pai.direita = no;
			} else {
				this.adiciona(pai.direita, valor);
			}
		} else {
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
            if (no.esquerda != null) {
                this.remove(no.esquerda);
            }
            
            if(no.direita != null) {
                this.remove(no.direita);
            }
            
            if (no.pai == null) {
                this.raiz = null;
            } else {
                if (no.pai.esquerda == no) {
                    no.pai.esquerda = null;
                } else {
                    no.pai.direita = null;
                }
            }
        }
        
        public void percorrer(No<T> no) {
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
            if (no != null) {
                if (no.valor.equals(valor)) {
                    return no;
                }
                
                No<T> aux = localizar (no.esquerda, valor);
                if (aux != null) {
                    return aux;
                }
                
                aux = localizar (no.direita, valor);
                if (aux != null) {
                    return aux;
                }
            }
            return null;
        }
}