public class No{
	private Object o;
	private No next, previous;

	public No (Object o, No next, No previous){
		this.o = o;
		this.next = next;
		this.previous = previous;
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

	public No getPrevious(){
		return previous;
	}

	public void setPrevious(No n){
		previous = n;
	}
}