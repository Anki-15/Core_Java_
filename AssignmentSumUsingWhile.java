
public class AssignmentSumUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		int sum=0;
		while(number<=11)
		{
			System.out.println(number);
			sum=sum+number;
			number++;
			System.out.println("after adding the previous number the output is :" +sum);
		}
		System.out.println("the final output is: " +sum);
	}

}
