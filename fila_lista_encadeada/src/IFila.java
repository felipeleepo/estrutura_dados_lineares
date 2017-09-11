/**
 *
 * @author Felipe
 */
public interface IFila {
    public int size();
    
    public boolean isEmpty();
    
    public Object inicio() throws EFilaVazia;
    
    public void enfileirar(Object o);
    
    public Object desenfileirar() throws EFilaVazia;
}
