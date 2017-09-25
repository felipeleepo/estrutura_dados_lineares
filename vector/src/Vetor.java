/**
 *
 * @author Felipe
 */
public class Vetor implements IVetor{
	private Object S[];
	private int op, tam;
	public Vetor (int n, int op){
		this.op = op;
		S = new Object[n];
		tam = 0;
	}

    public int size(){
    	return tam;
    }
    
    public boolean isEmpty(){
    	return tam == 0;
    }

    public Object elemAtRank(int r) throws EVetorVazio, ERankInvalido{
    	if(!isEmpty()){
    		if(r >= 0 && r < S.length){
    			return S[r];
    		}
    		throw new ERankInvalido("Rank Inválido");
    	}
    	throw new EVetorVazio("Vetor Vazio");
    }

    public Object replaceAtRank(int r, Object o) throws EVetorVazio, ERankInvalido{
    	if(!isEmpty()){
    		if(r >= 0 && r < S.length){
    			Object aux = S[r];
    			S[r] = o;
                if(aux == null)
                    tam++;
    			return aux;
    		}
    		throw new ERankInvalido("Rank Inválido");
    	}
    	throw new EVetorVazio("Vetor Vazio");
    }

    public String insertAtRank(int r, Object o) throws ERankInvalido{
		if(r >= 0 && r < S.length){
            //if(elemAtRank(r) == null){
    			if (size()+1 < S.length) {

        			for (int i = size() - 1; i > r; i-- ) {

    					S[i] = S[i-1];
    				}
                    if (S[r] == null)
                        tam++;                    
    				S[r] = o;
                    return "Valor inserido.";
    			}else{

                    System.out.println("O vetor foi aumentado.");
    				aumentar();
                    return insertAtRank(r, o);
    			}
           /* }
            r\eturn "Índice já preenchido, utilize o replaceAtRank";            */
		}
		throw new ERankInvalido("Rank Inválido");
    }

    public Object removeAtRank(int r) throws EVetorVazio, ERankInvalido{
    	if(!isEmpty()){
    		if(r >= 0 && r < tam){
    			Object aux = S[r];
    			for (int i = r+1; i < size()-1 ; i++ ) {
    				S[i-1] = S[i];
    			}
                if(aux != null)
                    tam--;
    			return aux;
    		}
    		throw new ERankInvalido("Rank Inválido");
    	}
    	throw new EVetorVazio("Vetor Vazio");
    }

    public void aumentar(){
        int n;
        Object aux[];
        if(op <= 0){
            n = (size()+1)*2;
        }
        else{
            n = size()+1+op;
        }
        aux = new Object[n];
        aux = S.clone();
        S = new Object[n]; 
        for(int i = 0; i<aux.length;i++)
            S[i] = aux[i];   

    }

    public String toString(){
    	String result = "--- PRINT ---";
    	for (int i = 0; i < S.length ; i++) {
    		result += "\n" + i + " - " + S[i];
    	}
    	return result;
    }
}
