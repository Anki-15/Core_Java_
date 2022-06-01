
public class TestSuperSub {

	public static void main(String[] args) {
		Sub s= new Sub();
		System.out.println("value befor increement "+s.x);
		s.increement();
		System.out.println("value after increement "+s.x);
		System.out.println("------------------");
		
		System.out.println(s.getSuperX());
		Super s1=new Super();
		System.out.println("value before increement" +s1.x);
		s1.increement();
		System.out.println("value after increement "+s1.x);
	}

}
