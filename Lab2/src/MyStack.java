import java.util.EmptyStackException;

public class MyStack {

	private Object[] stack;
	private int maxSize;
	private int top;
	//LIFO last-in-first-out
	
	public MyStack(int size) {
		maxSize = size;
		stack = new Object[maxSize];
		top = -1;
	}
	
	public Object push(Object item) {
		
		stack[++top] = item;
		return item;
	}
	
	public Object pop() {
		return stack[top--];
	}
	
	public Object peek() throws EmptyStackException {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top;
	}
	
	public boolean clear() {
		if ( !this.isEmpty() ) {
			Object[] temp = new Object[maxSize];
			stack = temp;
			System.out.println("Stack cleared");
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean contains(Object item) {
		if ( top != -1 ) {
			for (int i = 0; i <= top; i++) {
				if (stack[i] == item) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}
	
	public int indexOf(Object item) {
		if ( top != -1 ) {
			for (int i = 0; i <= top; i++) {
				if (stack[i] == item) {
					return i;
				}
			}
			return -1;
		} else {
			return -1;
		}
	}
	
	public void view() {
		if ( top != -1 ) {
			System.out.println("-- Stack - from top to bottom --");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
			System.out.println("--------------------------------");
		} else {
			System.out.println("Stack is empty.");
		}
	}
	
	@Override
	public String toString() {
		if ( top != -1 ) {
			String temp = new String();
			temp += "-- Stack - from top to bottom --\n";
			for (int i = top; i >= 0; i--) {
				temp += stack[i] + "\n";
			}
			temp += "--------------------------------";
			return temp;
		} else {
			return "Stack is empty.";
		}
	}
	
}
