
public class AssignmentTernaryGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=100;
		String grade=(marks<60)?"fail":(marks>=60&&marks<90)?"passed":"passed with distinction";
		System.out.println(grade);
	}

}
