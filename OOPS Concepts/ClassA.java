package interviews;

class ClassOut {
	
	public ClassOut() {
		System.out.println("I am out");
	}
}

public class ClassA {

	public ClassA() {
		System.out.println("I am A");
	}
	
	public void funcI1() {
		System.out.println("I am func I in classA");
	}
	
	public void funcA() {
		System.out.println("I am func A");
	}
	
	public static class ClassB{
		
		public ClassB() {
			System.out.println("I am B");
		}
		
		public void funcI1() {
			System.out.println("I am func I in ClassB");
		}
		
	}

	public static class ClassC{
		
		public ClassC() {
			System.out.println("I am C");
			String[] args1=null; 
//			ClassA.main(args1);
		}

		public static void main(String[] args) {
			System.out.println("hello in C");
//			ClassA a1 = new ClassA();
//			ClassA a2 = new ClassB();
//			ClassA a3 = new ClassC();
//			ClassB b1 = new ClassA();
			ClassB b2 = new ClassB();
//			ClassB b3 = new ClassC();
//			ClassC c1 = new ClassA();
//			ClassC c2 = new ClassB();
//			ClassC c3 = new ClassC();
		}
	}

	public static void main(String[] args) {
		
		ClassA a1 = new ClassA();
		ClassB b2 = new ClassB();
		ClassC c3 = new ClassC();
		ClassA.ClassC.main(null);
	}

}
