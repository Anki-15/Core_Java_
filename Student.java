
public class Student 
{
	public Student(String name,int age, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	private void checkAndChange(int age)
	{
		if(age>=18&&age<=45)
		{
			this.age=age;
		}
		else
		{
			System.out.println("Age should be between 18 and 40 only.");
			System.out.println("Exiting the program...");
			System.exit(-1);
		}
	}
	public void Print()
	{
		System.out.println("student Details: \n"+this.name+"\n"+this.age+"\n"+this.id);
	}
	private int age;
	private String name;
	private int id;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
