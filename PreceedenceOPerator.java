
public class PreceedenceOPerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		a = --a + a++ * a-- + a++;
		System.out.println("a = " + a);
		
		a = 1;
		a = -a-- + a++ / -a-- * --a;
		System.out.println("a = " + a);
		
		a = 2;
		boolean res = a++ == 2 || --a == 2 && --a == 2;
		System.out.println("res = " + res); 
		System.out.println(a);
	}

}
