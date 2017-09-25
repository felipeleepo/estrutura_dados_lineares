/**
 *
 * @author Felipe
 */
public interface IVetor {
    public int size();
    
    public boolean isEmpty();

    public Object elemAtRank(int r) throws EVetorVazio, ERankInvalido;

    public Object replaceAtRank(int r, Object o) throws EVetorVazio, ERankInvalido;

    public String insertAtRank(int r, Object o) throws ERankInvalido;

    public Object removeAtRank(int r) throws EVetorVazio, ERankInvalido;
}
