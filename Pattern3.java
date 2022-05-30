
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stop=30;
		outer:
		for(int i=1;i<=100;i++)
		{
			inner:
			for(int j=1;j<=10;j++)
			{
				int num=i*j;
				System.out.print(num + "\t");
				if(num==30)
					break outer;
			}
			System.out.println();
		}
	}

}
