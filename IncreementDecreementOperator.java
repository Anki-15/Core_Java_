
public class IncreementDecreementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 30, j = 15;
		i++; 
		--j; 
		System.out.println("i = " + i); 
		System.out.println("j = " + j); 
		
		
		int res = i++ + --j - --j + j++;
		
		System.out.println("res = " + res); 
		System.out.println("i = " + i); 
		System.out.println("j = " + j); 
	}

}
