
public class countTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		int hc=0;
		int cen=0;
		int doublecent=0;
		for (int i=0;i<scores.length;i++) 
			{
				if(scores[i]>=50 && scores[i]<100)
					hc++;
				else if(scores[i]>=100 && scores[i]<200)
					cen++;
				else if(scores[i]>=200 )
					doublecent++;
			}
		System.out.println(hc);
		System.out.println(cen);
		System.out.println(doublecent);
	}

}
