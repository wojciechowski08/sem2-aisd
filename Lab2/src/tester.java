
public class tester {

	public static void main(String[] args) {
		
		MyStack test = new MyStack(10);
		
		test.view();
		test.push("one");
		test.view();
		test.push("two");
		test.view();
		System.out.println(test.peek());
		test.view();
		System.out.println(test.pop());
		test.view();
		test.push("three");
		test.push("four");
		test.view();
		System.out.println(test.contains("four"));
		test.peek();
		test.pop();
		test.view();
		System.out.println(test.contains("five"));
		test.clear();
		test.view();
		test.push("one");
		test.push("two");
		test.push("three");
		test.view();

		
	}
	
}
