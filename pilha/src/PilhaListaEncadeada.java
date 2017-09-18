//import No;
public class PilhaListaEncadeada implements IPilha{
	private No node;
	private int t;

	public PilhaListaEncadeada (){
		node = null;
		t = 0;
	}

	public int size(){
		return t;
	}

	public boolean isEmpty(){
		return t == 0;
	}

	public Object top() throws EPilhaVazia{
		if(!isEmpty())
			return node.getO();
		throw new EPilhaVazia("Pilha Vazia.");
	}

	public Object pop() throws EPilhaVazia{
		if(isEmpty())
			throw new EPilhaVazia("Pilha Vazia.");
		else{
			Object aux = node.getO();
			node = node.getNext();
			t--;
			return aux;
		}
	}

	public void push(Object o){
		No aux;
		if(isEmpty())
			aux = new No(o, null);
		else
			aux = new No(o, node);
		node = aux;			
		t++;
	}

	public String toString(){
		String result = "---- PRINT ----";
		No aux = node;
		int i = 0;
		while(aux != null){
			result += "\n" + i + " - "+ aux.getO();
			aux = aux.getNext();
			i++;
		}
		return result;
	}
}