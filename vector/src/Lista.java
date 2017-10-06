public class Lista implements ILista{
	private int tam;
	private No head, tail;

	public Lista(){
		tam = 0;
		head = new No(null, null, null);
		tail = new No(null, null, null);
	}

	int size(){
		return tam;
	}

	boolean isEmpty(){
		return tam == 0;
	}

	boolean isFirst(No n) throws EListaVazia{
		if(!isEmpty()){
			return n == head.getNext();
		}
		throw new EListaVazia("Lista Vazia.");
	}

	boolean isLast(No n) throws EListaVazia{
		if(!isEmpty()){
			return n == tail.getPrevious();
		}
		throw new EListaVazia("Lista Vazia.");
	}

	No first() throws EListaVazia{
		if(!isEmpty()){
			return head.getNext();
		}
		throw new EListaVazia("Lista Vazia.");
	}

	No last() throws EListaVazia{
		if(!isEmpty()){
			return tail.getPrevious();
		}
		throw new EListaVazia("Lista Vazia.");
	}

	No before(No n) throws EListaVazia{
		if(!isEmpty()){
			return n.getPrevious();
		}
		throw new EListaVazia("Lista Vazia.");
	}

	No after(No n) throws EListaVazia{
		if(!isEmpty()){
			return n.getNext();
		}
		throw new EListaVazia("Lista Vazia.");
	}

	Object replaceElement(No n, Object o) throws EListaVazia{
		if(!isEmpty()){
			No aux = head;
			while(aux.getNext() != isLast()){
				if(aux == n){
					Object x = aux.getO();
					aux.setO(o);
					return x;
				}
			}
			return null;
		}
		throw new EListaVazia("Lista Vazia.");
	}

	void insertBefore(No n, Object o){
		No aux = new No(o, n, n.getPrevious());
		n.getPrevious().setNext(aux);
		n.setPrevious(aux);
		tam++;
	}

	void insertAfter(No n, Object o){
		No aux = new No(o, n.getNext(), n);
		n.getNext().setPrevious(aux);
		n.setNext(aux);	
		tam++;	
	}

	void insertFirst(Object o){
		No aux = new No(o, head, head.getNext());
		head.getNext().setPrevious(aux);
		head.setNext(aux);
		tam++;
	}

	void insertLast(Object o){
		No aux = new No(o, tail, tail.getPrevious());
		tail.getPrevious().setNext(aux);
		tail.setPrevious(aux);
		tam++;
	}	

	Object remove(No n) throws EListaVazia{
		if(!isEmpty()){
			No aux = head;
			while(aux.getNext() != isLast()){
				if(aux == n){
					Object o = aux.getO();
					aux.getPrevious().setNext(aux.getNext());
					aux.getNext().setPrevious(aux.getPrevious());
					return o;
				}
			}
			return null;
		}
		throw new EListaVazia("Lista Vazia.");
	}

	String toString(){
		if(!isEmpty()){
			String result = "---- PRINT ----";
			No aux = head;
			int i = 0;
			while(aux.getNext() != isLast()){
				result += "\n" i + " - " + aux.getO();
				i++;
			}
			return result;
		}
		return "Lista Vazia";
	}
}