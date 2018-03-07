import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<T> implements Iterable<T> {
	
private Object[] data;
private int default_size;

	//working - must provide <T>
	public MyList(T anArray[]) {
		data = anArray;
	}
	
	//working
	public int size() {
		int s = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				s++;
			}
		}
		return s;
	}
	
	//working
	public boolean isEmpty() {
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	//working
	public boolean contains(T o) {
		for (int i =0; i < data.length; i++) {
			if ( data[i].equals(o) ) {
				return true;
			}
		}
		return false;
	}
	
	//working
	public int indexOf(T o) {
		int i = 0;
		for (; i < data.length; i++) {
			if ( data[i].equals(o) ) {
				return i;
			}
		}
		return -1;										//if not found
	}
	
	//working
	public Object get(int i) {
		if (i < data.length && i >= 0) {
			return data[i];
		} else {
			return null;
		}
	}
	
	//working
	public boolean set(int index, T element) {
		if (index < data.length && index >= 0) {
			data[index] = element;
			return true;
		} else {
			return false;
		}
		
	}
	
	//working
	public boolean add(T elem) {
		Object[] temp = new Object[data.length + 1];
		int i = 0;
		for (; i < data.length; i++) {					//coping old data[] to new with last element empty
			temp[i] = data[i];
		}
		temp[i] = elem;									//adding last element at the end
		data = temp;
		return true;
	}
	
	//working
	public boolean remove(T element) {
		
		boolean found = false;
		int i = 0;
		for (; i < data.length; i++) {
			if ( data[i].equals(element) ) {
				found = true;
				break;
			}
		}
		if (! found) { return false; }
		
		Object[] temp = new Object[data.length - 1];
		int j = 0;
		for (; j < i; j++) {
			temp[j] = data[j];
		}
		j++;
		for (; j < data.length; j++) {
			temp[j-1] = data[j];
		}
		data = temp;
		return true;
	}
	
	//working
	public boolean remove(int index) {
		if (index < data.length && index >= 0) {
			Object[] temp = new Object[data.length - 1];
			int j = 0;
			for (; j < index; j++) {
				temp[j] = data[j];
			}
			j++;
			for (; j < data.length; j++) {
				temp[j-1] = data[j];
			}
			data = temp;
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	public Iterator<T> iterator() {
		Iterator<T> iter = new Iterator<T>() {
			
			private int pos = 0;
			
			@Override
			public boolean hasNext() {
				return pos < default_size && data[pos] != null;
			}
			
			@Override
			public T next() throws NoSuchElementException {
				pos++;
				return (T) data[pos];
			}
			
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return iter;
	}

}
