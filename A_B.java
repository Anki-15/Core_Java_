public class A_B {
	public static void main(String[] args) {
		A a = new A(); 
		a.setValue(5); 
		System.out.println("a.getValue() = " + a.getValue()); 
		
		B b = new B(); 
		b.setValue(77);
		System.out.println("b.getValue() = " + b.getValue()); 
		
		b.setName("ankita");
		System.out.println(b.getName());
	}
}