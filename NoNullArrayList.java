import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
	public NoNullArrayList() {
		super();
	}
	public NoNullArrayList(int ic) {
		super(ic);
	}
	
	public T set(int ind, T el) {
		if(el == null) {
			throw new IllegalArgumentException("Can't set null");
		}
		else{
			return(super.set(ind, el));
		}
	}
	
	public boolean add(T obj) {
		if(obj == null) {throw new IllegalArgumentException("Can't add null");}
		else {
			return(super.add(obj));
		}
	}
	
	public void add(int ind, T obj) {
		if(obj == null) {throw new IllegalArgumentException("Can't add null");}
		else {
			super.add(ind, obj);
		}
	}
}