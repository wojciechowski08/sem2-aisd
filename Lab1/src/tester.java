
public class tester {

	public static void main(String[] args) {
		
		String[] t = new String[1];
		t[0] = "one";
		MyList<Object> test = new MyList<Object>(t);
		System.out.println(test.size());
		
		test.add("two");
		System.out.println(test.size());
		test.add("three");
		test.add("four");
		test.add("five");
		System.out.println(test.size());
		System.out.println(test.get(1));
		System.out.println(test.get(2));
		test.set(2, "foo");
		System.out.println(test.get(2));
		System.out.println(test.indexOf("foo"));
		System.out.println(test.indexOf("bar"));
		System.out.println(test.contains("foo"));
		System.out.println(test.contains("bar"));
		System.out.println(test.isEmpty());
		System.out.println("-------------");
		System.out.println(test.size());
		System.out.println(test.get(1));
		test.remove(1);
		System.out.println(test.size());
		System.out.println(test.get(1));
		System.out.println("-------------");
		test.remove("foo");
		System.out.println(test.size());
		System.out.println(test.get(1));
		test.remove(2);
		System.out.println(test.size());
		System.out.println(test.get(2));
	}
	
}
