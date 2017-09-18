public class FilaListaEncadeada implements IFila{
	private No node;
	private int t;
	public FilaListaEncadeada (){
		node = null;
		t = 0;
	}

	public int size(){
		return t;
	}
    
    public boolean isEmpty(){
    	return t == 0;
    }
    
    public Object inicio() throws EFilaVazia{
	    if(!isEmpty()){
	    	No aux = node;
	    	while(aux != null){
	    		aux = aux.getNext();
	    	}
	    	return aux.getO();
	    }
	    throw new EFilaVazia("Fila Vazia");
    }
    
    public void enfileirar(Object o){
    	No aux = new No(o, node);
    	node = aux;
        aux = null;
    	t++;
    }
    
    public Object desenfileirar() throws EFilaVazia{
    	if(!isEmpty()){
    		Object o = node.getO();
    		node = node.getNext();
    		t--;
    		return o;
    	}
    	throw new EFilaVazia("Fila Vazia.");
    }	    	

    public String toString(){
    	String result= "---- PRINT -----\n";
    	No aux = node;
    	while(aux != null){
    		result += aux.getO() + "\n";
	    	aux = aux.getNext();
	    }
	    return result;
    }
}