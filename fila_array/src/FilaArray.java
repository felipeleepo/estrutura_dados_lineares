public class FilaArray implements IFila{
	private Object[] o;
	private int i,f, n, op;
	public FilaArray(int n, int op){
		i = 0;
		f = 0;
		this.n = n;
		o = new Object[n];
		this.op = op;
	}

	public int size(){
		return (n - i + f) % n;
	}
    
    public boolean isEmpty(){
    	return i == f;
    }
    
    public Object inicio() throws EFilaVazia{
    	return o[i];
    }
    
    public void enfileirar(Object x){
    	if(size() == n - 1){
    		System.out.println("Aumentar");
     	}else{
     		o[f] = x;
    		f = (f+1) % n;
     	}
    }
    
    public Object desenfileirar() throws EFilaVazia{
    	if(!isEmpty()){
    		Object aux = o[i];
    		i = (i+1) % n;
    		return aux;
    	}
    	throw new EFilaVazia("Fila Vazia.");
    }

    public String toString(){
    	int j = i;
    	String result = "";
    	while(j != f){
    		result += "Valor: " + o[j] + "\n";
    		j = (j + 1 ) % n;
    	}
    	return result;
    }
}