import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	
	public OrderedArrayList() {
		super();
	}
	public OrderedArrayList(int incap) {
		super(incap);
	}
	
	public boolean add(T obj) {
		if(this.size() == 0) {
			return(super.add(obj));
		}
		else {
			for(int q = 0; q < this.size(); q++) {
				if(obj.compareTo(this.get(q)) <= 0) {
					super.add(q, obj);
					break;
				}
			}
			return true;
		}
	}
	public void add(int ind, T obj) {
		if(this.size() == 0) {
			super.add(obj);
		}
		else {
			for(int q = 0; q < this.size(); q++) {
				if(obj.compareTo(this.get(q)) <= 0) {
					super.add(q, obj);
					break;
				}
			}
		}
	}
	
	public T set(int ind, T obj) {
		T old = super.remove(ind);
		this.add(obj);
		return old;
	}
	
}