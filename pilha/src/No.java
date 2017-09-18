public class No{
	private Object o;
	private No next;

	public No (Object o, No next){
		this.o = o;
		this.next = next;
	}

	public Object getO(){
		return o;
	}

	public No getNext(){
		return next;
	}

	public void setNext(No n){
		next = n;
	}
}