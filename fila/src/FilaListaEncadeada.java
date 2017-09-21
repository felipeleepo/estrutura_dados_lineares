public class FilaListaEncadeada implements IFila{
	private No i;
	private int t;

	public FilaListaEncadeada (){
		t = 0;
        i = null;
	}

	public int size(){
		return t;
	}
    
    public boolean isEmpty(){
    	return t == 0;
    }
    
    public Object inicio() throws EFilaVazia{
	    if(!isEmpty()){
	    	return i.getO();
	    }
	    throw new EFilaVazia("Fila Vazia");
    }
    
    public void enfileirar(Object o){
        No aux = new No(o, null);
        if(i == null){
            i = aux;
        }else{
            No aux_i = i;
            while(aux_i.getNext() != null){
                aux_i = aux_i.getNext();
            }
            aux_i.setNext(aux); 
        }
    	t++;
    }
    
    public Object desenfileirar() throws EFilaVazia{
    	if(!isEmpty()){
    		Object o = i.getO();
    		i = i.getNext();
    		t--;
    		return o;
    	}
    	throw new EFilaVazia("Fila Vazia.");
    }	    	

    public String toString(){
    	String result= "---- PRINT ----\n";
    	No aux = i;
    	while(aux != null){
    		result += "\n" + aux.getO();
	    	aux = aux.getNext();
	    }
	    return result;
    }
}