package interviews;

interface ifa{
	public void func1();
	public int func2();
	public void InhertiA();
}

public class InhertiA extends ClassA implements ifa{

	public void funcI() {
		System.out.println("I am func I");
	}
	
	public void funcI1() {
		System.out.println("I am func I in inherit");
	}
	
	public InhertiA() {
		System.out.println("I am inherit A");
	}
	
	public void InhertiA() {
		System.out.println("I am inherit A");
	}

	public void func1() {
		System.out.println("func1");
	}

	@Override
	public int func2() {
		System.out.println("func2");
		return 0;
	}

	public static void main(String[] args) {
		InhertiA ia1= new InhertiA();
//		InhertiA ia2= new ClassA();
		ClassA ia3= new InhertiA();
		ClassA ia4= new ClassA();
		
		ia1.funcA();
		ia1.funcI();
		ia3.funcA();
		ia1.funcI1();
		ia3.funcI1();
		ia4.funcI1();
		ClassB xyz = new ClassB();
		xyz.funcI1();
		ClassA.ClassC.main(null);
		InhertiA.ClassC.main(null);
		ia4.funcA();
//		ia3.funcI();
//		ia4.funcI();
	}
}
