
public class LongPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l1 = 5000L; //Suffix L is optional, 
		System.out.println("l1 = " + l1);
		long l2 = -5000; //Suffix L is optional
		System.out.println("l2 = " + l2);
		
		long l3 = -2147483649l; //Suffix L is compulsory, this number is out of int range.
		System.out.println("l3 = " + l3);
		
		long l4 = 2147483648L; //Suffix L is compulsory, this number is out of int range.
		System.out.println("l4 = " + l4);
		
		long creditCardNumber = 5876_1234_3452_9832L; //Suffix L is compulsory, 
		System.out.println("creditCardNumber = " + creditCardNumber);
	}

}
