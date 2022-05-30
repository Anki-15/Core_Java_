
public class Range1_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int[1000];
		int val=1;
		for(int i=0;i< 1000;i++)
		{
			arr[i]=val++;
		}
		int ctr=1;
		for(int i=0;i< arr.length;i++)
		{
			System.out.print(arr[i]+ "\t");
			if(ctr++%10==0)
				System.out.println();
		}
	}

}
