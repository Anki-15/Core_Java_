
public class ElementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		char search1='B';
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search1) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("B found!");
		else
			System.out.println("element not found!");
	}

}
