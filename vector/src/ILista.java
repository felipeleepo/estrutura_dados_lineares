public interface ILista{
	int size();

	boolean isEmpty();

	boolean isFirst(No n) throws EListaVazia;

	boolean isLast(No n) throws EListaVazia;

	No first() throws EListaVazia;

	No last() throws EListaVazia;

	No before(No n) throws EListaVazia;

	No after(No n) throws EListaVazia;

	Object replaceElement(No n, Object o) throws EListaVazia;

	void insertBefore(No n, Object o);

	void insertAfter(No n, Object o);

	void insertFirst(Object o);

	void insertLast(Object o);	

	Object remove(No n) throws EListaVazia;
}