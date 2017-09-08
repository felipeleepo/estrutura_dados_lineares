//import No;
public class PilhaListaEncadeada{
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

	public Object top(){
		return node.getO();
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
		No aux = new No (o, node);
		node = aux;	
		
		t++;
	}

	public String toString(){
		String result = "";
		No aux = node;
		while(aux != null){
			result += aux.getO() + "\n";
			aux = aux.getNext();
		}
		return result;
	}
}